package io.cisigep.springReact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BasicPersistenceObject {

  @Id
  @GeneratedValue
  private Long id;
  private String stringValue;
  private int numValue;

  public BasicPersistenceObject() {
  }

  public BasicPersistenceObject(String stringValue, int numValue) {
    super();
    this.stringValue = stringValue;
    this.numValue = numValue;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public int getNumValue() {
    return numValue;
  }

  public void setNumValue(int numValue) {
    this.numValue = numValue;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + numValue;
    result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BasicPersistenceObject other = (BasicPersistenceObject) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (numValue != other.numValue)
      return false;
    if (stringValue == null) {
      if (other.stringValue != null)
        return false;
    } else if (!stringValue.equals(other.stringValue))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "BasicPersistenceObject [id=" + id + ", stringValue=" + stringValue + ", numValue=" + numValue + "]";
  }

}
