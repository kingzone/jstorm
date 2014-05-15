/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerSummary implements org.apache.thrift7.TBase<WorkerSummary, WorkerSummary._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("WorkerSummary");

  private static final org.apache.thrift7.protocol.TField PORT_FIELD_DESC = new org.apache.thrift7.protocol.TField("port", org.apache.thrift7.protocol.TType.I32, (short)1);
  private static final org.apache.thrift7.protocol.TField TOPOLOGY_FIELD_DESC = new org.apache.thrift7.protocol.TField("topology", org.apache.thrift7.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift7.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift7.protocol.TField("tasks", org.apache.thrift7.protocol.TType.LIST, (short)3);

  private int port; // required
  private String topology; // required
  private List<TaskSummary> tasks; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    PORT((short)1, "port"),
    TOPOLOGY((short)2, "topology"),
    TASKS((short)3, "tasks");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PORT
          return PORT;
        case 2: // TOPOLOGY
          return TOPOLOGY;
        case 3: // TASKS
          return TASKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PORT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PORT, new org.apache.thrift7.meta_data.FieldMetaData("port", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.TOPOLOGY, new org.apache.thrift7.meta_data.FieldMetaData("topology", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASKS, new org.apache.thrift7.meta_data.FieldMetaData("tasks", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
            new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, TaskSummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(WorkerSummary.class, metaDataMap);
  }

  public WorkerSummary() {
  }

  public WorkerSummary(
    int port,
    String topology,
    List<TaskSummary> tasks)
  {
    this();
    this.port = port;
    set_port_isSet(true);
    this.topology = topology;
    this.tasks = tasks;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkerSummary(WorkerSummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.port = other.port;
    if (other.is_set_topology()) {
      this.topology = other.topology;
    }
    if (other.is_set_tasks()) {
      List<TaskSummary> __this__tasks = new ArrayList<TaskSummary>();
      for (TaskSummary other_element : other.tasks) {
        __this__tasks.add(new TaskSummary(other_element));
      }
      this.tasks = __this__tasks;
    }
  }

  public WorkerSummary deepCopy() {
    return new WorkerSummary(this);
  }

  @Override
  public void clear() {
    set_port_isSet(false);
    this.port = 0;
    this.topology = null;
    this.tasks = null;
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bit_vector.clear(__PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return __isset_bit_vector.get(__PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bit_vector.set(__PORT_ISSET_ID, value);
  }

  public String get_topology() {
    return this.topology;
  }

  public void set_topology(String topology) {
    this.topology = topology;
  }

  public void unset_topology() {
    this.topology = null;
  }

  /** Returns true if field topology is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology() {
    return this.topology != null;
  }

  public void set_topology_isSet(boolean value) {
    if (!value) {
      this.topology = null;
    }
  }

  public int get_tasks_size() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public java.util.Iterator<TaskSummary> get_tasks_iterator() {
    return (this.tasks == null) ? null : this.tasks.iterator();
  }

  public void add_to_tasks(TaskSummary elem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskSummary>();
    }
    this.tasks.add(elem);
  }

  public List<TaskSummary> get_tasks() {
    return this.tasks;
  }

  public void set_tasks(List<TaskSummary> tasks) {
    this.tasks = tasks;
  }

  public void unset_tasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean is_set_tasks() {
    return this.tasks != null;
  }

  public void set_tasks_isSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((Integer)value);
      }
      break;

    case TOPOLOGY:
      if (value == null) {
        unset_topology();
      } else {
        set_topology((String)value);
      }
      break;

    case TASKS:
      if (value == null) {
        unset_tasks();
      } else {
        set_tasks((List<TaskSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PORT:
      return Integer.valueOf(get_port());

    case TOPOLOGY:
      return get_topology();

    case TASKS:
      return get_tasks();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PORT:
      return is_set_port();
    case TOPOLOGY:
      return is_set_topology();
    case TASKS:
      return is_set_tasks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkerSummary)
      return this.equals((WorkerSummary)that);
    return false;
  }

  public boolean equals(WorkerSummary that) {
    if (that == null)
      return false;

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_topology = true && this.is_set_topology();
    boolean that_present_topology = true && that.is_set_topology();
    if (this_present_topology || that_present_topology) {
      if (!(this_present_topology && that_present_topology))
        return false;
      if (!this.topology.equals(that.topology))
        return false;
    }

    boolean this_present_tasks = true && this.is_set_tasks();
    boolean that_present_tasks = true && that.is_set_tasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_port = true;
    builder.append(present_port);
    if (present_port)
      builder.append(port);

    boolean present_topology = true && (is_set_topology());
    builder.append(present_topology);
    if (present_topology)
      builder.append(topology);

    boolean present_tasks = true && (is_set_tasks());
    builder.append(present_tasks);
    if (present_tasks)
      builder.append(tasks);

    return builder.toHashCode();
  }

  public int compareTo(WorkerSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    WorkerSummary typedOther = (WorkerSummary)other;

    lastComparison = Boolean.valueOf(is_set_port()).compareTo(typedOther.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.port, typedOther.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_topology()).compareTo(typedOther.is_set_topology());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.topology, typedOther.topology);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_tasks()).compareTo(typedOther.is_set_tasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_tasks()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.tasks, typedOther.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PORT
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.port = iprot.readI32();
            set_port_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TOPOLOGY
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.topology = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TASKS
          if (field.type == org.apache.thrift7.protocol.TType.LIST) {
            {
              org.apache.thrift7.protocol.TList _list228 = iprot.readListBegin();
              this.tasks = new ArrayList<TaskSummary>(_list228.size);
              for (int _i229 = 0; _i229 < _list228.size; ++_i229)
              {
                TaskSummary _elem230; // required
                _elem230 = new TaskSummary();
                _elem230.read(iprot);
                this.tasks.add(_elem230);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(PORT_FIELD_DESC);
    oprot.writeI32(this.port);
    oprot.writeFieldEnd();
    if (this.topology != null) {
      oprot.writeFieldBegin(TOPOLOGY_FIELD_DESC);
      oprot.writeString(this.topology);
      oprot.writeFieldEnd();
    }
    if (this.tasks != null) {
      oprot.writeFieldBegin(TASKS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, this.tasks.size()));
        for (TaskSummary _iter231 : this.tasks)
        {
          _iter231.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WorkerSummary(");
    boolean first = true;

    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("topology:");
    if (this.topology == null) {
      sb.append("null");
    } else {
      sb.append(this.topology);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tasks:");
    if (this.tasks == null) {
      sb.append("null");
    } else {
      sb.append(this.tasks);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_port()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

    if (!is_set_topology()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'topology' is unset! Struct:" + toString());
    }

    if (!is_set_tasks()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'tasks' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

