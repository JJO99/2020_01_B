package Controller.Watch.ctrl;

import org.springframework.util.StopWatch;

public class hahahahaha {
    private StopWatch stopWatch;

    public void setUp() {
        stopWatch = new StopWatch("hi");
    }


    public void testAddLongAndBigDecimal() {

        stopWatch.start("A");


        stopWatch.stop();

        stopWatch.start("B");

        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }
}
