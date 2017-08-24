package com.hydra;


import org.junit.Test;

public class App {


    @Test
    public void annotationSystemTest() {

        ScheduleSystemFactory factory = new AnnotationScheduleSystemFactory("com.hydra.entries");
        ScheduleSystem system = factory.getSystem();
        system.start();

    }

}
