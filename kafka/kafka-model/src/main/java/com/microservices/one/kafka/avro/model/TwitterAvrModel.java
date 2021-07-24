/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.microservices.one.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TwitterAvrModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5784147660276973461L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwitterAvrModel\",\"namespace\":\"com.microservices.one.kafka.avro.model\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"text\",\"type\":[\"string\",\"null\"]},{\"name\":\"createdAt\",\"type\":[\"long\",\"null\"],\"logicalType\":[\"null\",\"date\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TwitterAvrModel> ENCODER =
      new BinaryMessageEncoder<TwitterAvrModel>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TwitterAvrModel> DECODER =
      new BinaryMessageDecoder<TwitterAvrModel>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TwitterAvrModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TwitterAvrModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TwitterAvrModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TwitterAvrModel>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TwitterAvrModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TwitterAvrModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TwitterAvrModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TwitterAvrModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence userId;
   private long id;
   private java.lang.CharSequence text;
   private java.lang.Long createdAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TwitterAvrModel() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param id The new value for id
   * @param text The new value for text
   * @param createdAt The new value for createdAt
   */
  public TwitterAvrModel(java.lang.CharSequence userId, java.lang.Long id, java.lang.CharSequence text, java.lang.Long createdAt) {
    this.userId = userId;
    this.id = id;
    this.text = text;
    this.createdAt = createdAt;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return id;
    case 2: return text;
    case 3: return createdAt;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.Long)value$; break;
    case 2: text = (java.lang.CharSequence)value$; break;
    case 3: createdAt = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.CharSequence getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'text' field.
   * @return The value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }


  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }


  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.Long value) {
    this.createdAt = value;
  }

  /**
   * Creates a new TwitterAvrModel RecordBuilder.
   * @return A new TwitterAvrModel RecordBuilder
   */
  public static com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder newBuilder() {
    return new com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder();
  }

  /**
   * Creates a new TwitterAvrModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TwitterAvrModel RecordBuilder
   */
  public static com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder newBuilder(com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder other) {
    if (other == null) {
      return new com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder();
    } else {
      return new com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder(other);
    }
  }

  /**
   * Creates a new TwitterAvrModel RecordBuilder by copying an existing TwitterAvrModel instance.
   * @param other The existing instance to copy.
   * @return A new TwitterAvrModel RecordBuilder
   */
  public static com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder newBuilder(com.microservices.one.kafka.avro.model.TwitterAvrModel other) {
    if (other == null) {
      return new com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder();
    } else {
      return new com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for TwitterAvrModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwitterAvrModel>
    implements org.apache.avro.data.RecordBuilder<TwitterAvrModel> {

    private java.lang.CharSequence userId;
    private long id;
    private java.lang.CharSequence text;
    private java.lang.Long createdAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.text)) {
        this.text = data().deepCopy(fields()[2].schema(), other.text);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[3].schema(), other.createdAt);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing TwitterAvrModel instance
     * @param other The existing instance to copy.
     */
    private Builder(com.microservices.one.kafka.avro.model.TwitterAvrModel other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.text)) {
        this.text = data().deepCopy(fields()[2].schema(), other.text);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[3].schema(), other.createdAt);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder setId(long value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder clearId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'text' field.
      * @return The value.
      */
    public java.lang.CharSequence getText() {
      return text;
    }


    /**
      * Sets the value of the 'text' field.
      * @param value The value of 'text'.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder setText(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.text = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'text' field has been set.
      * @return True if the 'text' field has been set, false otherwise.
      */
    public boolean hasText() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'text' field.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder clearText() {
      text = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public java.lang.Long getCreatedAt() {
      return createdAt;
    }


    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder setCreatedAt(java.lang.Long value) {
      validate(fields()[3], value);
      this.createdAt = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public com.microservices.one.kafka.avro.model.TwitterAvrModel.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TwitterAvrModel build() {
      try {
        TwitterAvrModel record = new TwitterAvrModel();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.Long) defaultValue(fields()[1]);
        record.text = fieldSetFlags()[2] ? this.text : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.createdAt = fieldSetFlags()[3] ? this.createdAt : (java.lang.Long) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TwitterAvrModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<TwitterAvrModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TwitterAvrModel>
    READER$ = (org.apache.avro.io.DatumReader<TwitterAvrModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.userId);

    out.writeLong(this.id);

    if (this.text == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.text);
    }

    if (this.createdAt == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeLong(this.createdAt);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.userId = in.readString(this.userId instanceof Utf8 ? (Utf8)this.userId : null);

      this.id = in.readLong();

      if (in.readIndex() != 0) {
        in.readNull();
        this.text = null;
      } else {
        this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.createdAt = null;
      } else {
        this.createdAt = in.readLong();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.userId = in.readString(this.userId instanceof Utf8 ? (Utf8)this.userId : null);
          break;

        case 1:
          this.id = in.readLong();
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.text = null;
          } else {
            this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);
          }
          break;

        case 3:
          if (in.readIndex() != 0) {
            in.readNull();
            this.createdAt = null;
          } else {
            this.createdAt = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










