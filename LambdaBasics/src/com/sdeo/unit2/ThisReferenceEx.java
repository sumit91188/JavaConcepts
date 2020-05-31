package com.sdeo.unit2;

/**
 * @author Sumit Deo
 */
public class ThisReferenceEx {

    public static void main(String[] args) {

        ThisReferenceEx ex = new ThisReferenceEx();
        /*ex.doProcess(10, i -> {
            System.out.println(i);
        });*/
        ex.execute();
    }

    public void doProcess(int i, Process process) {
        process.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }

    @Override
    public String toString() {
        return "ThisReferenceEx{}";
    }
}
