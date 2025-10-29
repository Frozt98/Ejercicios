package edu.unl.cc.jbeginners.home.domain;

import edu.unl.cc.jbeginners.home.domain.Status;

import java.util.Objects;

public class ElectronicLock {
    private Integer key;
    private Status status;

    public ElectronicLock() {
        this.reset();
    }

    public ElectronicLock(String key) {
        this.validate(key);
        this.status = Status.OPEN;
    }

    public ElectronicLock(String key, Status status) {
        this.validate(key);
        this.status = status;
        this.key = Integer.valueOf(key);
    }

    public Status open(String key) {
        if (this.status == Status.CLOSED) {
            validate(key);
            if(this.key.equals(Integer.valueOf(key))) {
                this.status = Status.OPEN;
            }
        }
        return status;
    }
    public void close() {}

    public void validate(String key){
        if(key == null|| key.isEmpty()){
            throw new IllegalArgumentException((" El valor del campo key no puede ser nulo"));
        }
        if(key.length() !=4){
            throw new IllegalArgumentException(("El valor del campo key no puede ser mayor de 4 digitos"));
        }

    }

    public void reset(){
        this.status = Status.CLOSED;
        this.key = Integer.valueOf("1234");
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        validate(key.toString());
        this.key = key;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ElectronicLock{");
        sb.append("key=").append(key);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicLock that = (ElectronicLock) o;
        return Objects.equals(key, that.key) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, status);
    }
}

