// automatically generated by the FlatBuffers compiler, do not modify

package NamespaceA

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class TableInFirstNS : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : TableInFirstNS {
        __init(_i, _bb)
        return this
    }
    val fooTable : NamespaceA.NamespaceB.TableInNestedNS? get() = fooTable(NamespaceA.NamespaceB.TableInNestedNS())
    fun fooTable(obj: NamespaceA.NamespaceB.TableInNestedNS) : NamespaceA.NamespaceB.TableInNestedNS? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val fooEnum : Byte
        get() {
            val o = __offset(6)
            return if(o != 0) bb.get(o + bb_pos) else 0
        }
    fun mutateFooEnum(fooEnum: Byte) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.put(o + bb_pos, fooEnum)
            true
        } else {
            false
        }
    }
    val fooStruct : NamespaceA.NamespaceB.StructInNestedNS? get() = fooStruct(NamespaceA.NamespaceB.StructInNestedNS())
    fun fooStruct(obj: NamespaceA.NamespaceB.StructInNestedNS) : NamespaceA.NamespaceB.StructInNestedNS? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(o + bb_pos, bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_11_1()
        fun getRootAsTableInFirstNS(_bb: ByteBuffer): TableInFirstNS = getRootAsTableInFirstNS(_bb, TableInFirstNS())
        fun getRootAsTableInFirstNS(_bb: ByteBuffer, obj: TableInFirstNS): TableInFirstNS {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startTableInFirstNS(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addFooTable(builder: FlatBufferBuilder, fooTable: Int) = builder.addOffset(0, fooTable, 0)
        fun addFooEnum(builder: FlatBufferBuilder, fooEnum: Byte) = builder.addByte(1, fooEnum, 0)
        fun addFooStruct(builder: FlatBufferBuilder, fooStruct: Int) = builder.addStruct(2, fooStruct, 0)
        fun endTableInFirstNS(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
