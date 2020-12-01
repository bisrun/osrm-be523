#include "mytest/mytest.hpp"
#include "mytest/mytest_pipeline.hpp"

#include "guidance/files.hpp"
#include "guidance/guidance_processing.hpp"
#include "guidance/segregated_intersection_classification.hpp"
#include "guidance/turn_data_container.hpp"

#include "storage/io.hpp"

#include "util/exception.hpp"
#include "util/exception_utils.hpp"
#include "util/integer_range.hpp"
#include "util/log.hpp"
#include "util/range_table.hpp"
#include "util/timing_util.hpp"

#include "util/static_graph.hpp"
#include "util/static_rtree.hpp"

// Keep debug include to make sure the debug header is in sync with types.
#include "util/debug.hpp"



#include <boost/assert.hpp>
#include <boost/filesystem.hpp>
#include <boost/filesystem/fstream.hpp>
#include <boost/iterator/function_input_iterator.hpp>
#include <boost/optional/optional.hpp>
#include <boost/scope_exit.hpp>

#include <osmium/handler/node_locations_for_ways.hpp>
#include <osmium/index/map/flex_mem.hpp>
#include <osmium/io/any_input.hpp>
#include <osmium/osm/timestamp.hpp>
#include <osmium/thread/pool.hpp>
#include <osmium/visitor.hpp>

#include <tbb/pipeline.h>
#include <tbb/task_scheduler_init.h>

#include <cstdlib>

#include <algorithm>
#include <atomic>
#include <bitset>
#include <chrono>
#include <future>
#include <iostream>
#include <iterator>
#include <memory>
#include <thread>
#include <tuple>
#include <type_traits>
#include <unordered_map>
#include <vector>
using namespace std;
namespace osrm
{
namespace mytester
{

namespace
{
}
int Mytest::run()
{
    util::LogPolicy::GetInstance().Unmute();

    // Transform the node-based graph that OSM is based on into an edge-based graph
    // that is better for routing.  Every edge becomes a node, and every valid
    // movement (e.g. turn from A->B, and B->A) becomes an edge
    util::Log() << "Generating edge-expanded graph representation";

    TIMER_START(expansion);


    util::Log() << "Find segregated edges in node-based graph ..." << std::flush;
    TIMER_START(segregated);


    TIMER_STOP(segregated);
    util::Log() << "ok, after " << TIMER_SEC(segregated) << "s";


    util::Log() << "Writing nodes for nodes-based and edges-based graphs ...";


    TIMER_STOP(expansion);

    // output the geometry of the node-based graph, needs to be done after the last usage, since it
    // destroys internal containers

    util::Log() << "Saving edge-based node weights to file.";
    TIMER_START(timer_write_node_weights);
    TIMER_STOP(timer_write_node_weights);
    util::Log() << "Done writing. (" << TIMER_SEC(timer_write_node_weights) << ")";

    util::Log() << "Computing strictly connected components ...";

    util::Log() << "To prepare the data for routing, run: "
                << "./osrm-contract " ;

    auto pl = std::make_unique<Pipeline>();
    pl->run_pipeline();
   return 0;
}

} // namespace mytester
} // namespace osrm
