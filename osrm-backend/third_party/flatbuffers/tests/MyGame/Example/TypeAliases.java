// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TypeAliases extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_11_1(); }
  public static TypeAliases getRootAsTypeAliases(ByteBuffer _bb) { return getRootAsTypeAliases(_bb, new TypeAliases()); }
  public static TypeAliases getRootAsTypeAliases(ByteBuffer _bb, TypeAliases obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TypeAliases __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte i8() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateI8(byte i8) { int o = __offset(4); if (o != 0) { bb.put(o + bb_pos, i8); return true; } else { return false; } }
  public int u8() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateU8(int u8) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, (byte)u8); return true; } else { return false; } }
  public short i16() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public boolean mutateI16(short i16) { int o = __offset(8); if (o != 0) { bb.putShort(o + bb_pos, i16); return true; } else { return false; } }
  public int u16() { int o = __offset(10); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public boolean mutateU16(int u16) { int o = __offset(10); if (o != 0) { bb.putShort(o + bb_pos, (short)u16); return true; } else { return false; } }
  public int i32() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateI32(int i32) { int o = __offset(12); if (o != 0) { bb.putInt(o + bb_pos, i32); return true; } else { return false; } }
  public long u32() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateU32(long u32) { int o = __offset(14); if (o != 0) { bb.putInt(o + bb_pos, (int)u32); return true; } else { return false; } }
  public long i64() { int o = __offset(16); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateI64(long i64) { int o = __offset(16); if (o != 0) { bb.putLong(o + bb_pos, i64); return true; } else { return false; } }
  public long u64() { int o = __offset(18); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateU64(long u64) { int o = __offset(18); if (o != 0) { bb.putLong(o + bb_pos, u64); return true; } else { return false; } }
  public float f32() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateF32(float f32) { int o = __offset(20); if (o != 0) { bb.putFloat(o + bb_pos, f32); return true; } else { return false; } }
  public double f64() { int o = __offset(22); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean mutateF64(double f64) { int o = __offset(22); if (o != 0) { bb.putDouble(o + bb_pos, f64); return true; } else { return false; } }
  public byte v8(int j) { int o = __offset(24); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int v8Length() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer v8AsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public ByteBuffer v8InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 1); }
  public boolean mutateV8(int j, byte v8) { int o = __offset(24); if (o != 0) { bb.put(__vector(o) + j * 1, v8); return true; } else { return false; } }
  public double vf64(int j) { int o = __offset(26); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int vf64Length() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer vf64AsByteBuffer() { return __vector_as_bytebuffer(26, 8); }
  public ByteBuffer vf64InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 26, 8); }
  public boolean mutateVf64(int j, double vf64) { int o = __offset(26); if (o != 0) { bb.putDouble(__vector(o) + j * 8, vf64); return true; } else { return false; } }

  public static int createTypeAliases(FlatBufferBuilder builder,
      byte i8,
      int u8,
      short i16,
      int u16,
      int i32,
      long u32,
      long i64,
      long u64,
      float f32,
      double f64,
      int v8Offset,
      int vf64Offset) {
    builder.startTable(12);
    TypeAliases.addF64(builder, f64);
    TypeAliases.addU64(builder, u64);
    TypeAliases.addI64(builder, i64);
    TypeAliases.addVf64(builder, vf64Offset);
    TypeAliases.addV8(builder, v8Offset);
    TypeAliases.addF32(builder, f32);
    TypeAliases.addU32(builder, u32);
    TypeAliases.addI32(builder, i32);
    TypeAliases.addU16(builder, u16);
    TypeAliases.addI16(builder, i16);
    TypeAliases.addU8(builder, u8);
    TypeAliases.addI8(builder, i8);
    return TypeAliases.endTypeAliases(builder);
  }

  public static void startTypeAliases(FlatBufferBuilder builder) { builder.startTable(12); }
  public static void addI8(FlatBufferBuilder builder, byte i8) { builder.addByte(0, i8, 0); }
  public static void addU8(FlatBufferBuilder builder, int u8) { builder.addByte(1, (byte)u8, (byte)0); }
  public static void addI16(FlatBufferBuilder builder, short i16) { builder.addShort(2, i16, 0); }
  public static void addU16(FlatBufferBuilder builder, int u16) { builder.addShort(3, (short)u16, (short)0); }
  public static void addI32(FlatBufferBuilder builder, int i32) { builder.addInt(4, i32, 0); }
  public static void addU32(FlatBufferBuilder builder, long u32) { builder.addInt(5, (int)u32, (int)0L); }
  public static void addI64(FlatBufferBuilder builder, long i64) { builder.addLong(6, i64, 0L); }
  public static void addU64(FlatBufferBuilder builder, long u64) { builder.addLong(7, u64, 0L); }
  public static void addF32(FlatBufferBuilder builder, float f32) { builder.addFloat(8, f32, 0.0f); }
  public static void addF64(FlatBufferBuilder builder, double f64) { builder.addDouble(9, f64, 0.0); }
  public static void addV8(FlatBufferBuilder builder, int v8Offset) { builder.addOffset(10, v8Offset, 0); }
  public static int createV8Vector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startV8Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addVf64(FlatBufferBuilder builder, int vf64Offset) { builder.addOffset(11, vf64Offset, 0); }
  public static int createVf64Vector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startVf64Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static int endTypeAliases(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
}

