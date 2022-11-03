package org.example;

import java.util.Objects;

public class ComputerScienceStudent extends Student {

    private boolean good_in_java;
    private int IQ;

    public ComputerScienceStudent(int id, String name, boolean good_in_java,int IQ) {
        super(id, name);
        this.good_in_java = good_in_java;
        this.IQ=IQ;
    }

    public boolean isGood_in_java() {
        return good_in_java;
    }

    public void setGood_in_java(boolean good_in_java) {
        this.good_in_java = good_in_java;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "good_in_java=" + good_in_java +
                ", IQ=" + IQ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return good_in_java == that.good_in_java && IQ == that.IQ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), good_in_java, IQ);
    }
}
