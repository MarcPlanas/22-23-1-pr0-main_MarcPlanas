package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;


    private void fillQueue() {
        for (int c = 0; c < 10; c++) {
            //pr0q.add(Character.valueOf(c));
            pr0q.add(LocalDate.of(2023, 9, 28).plusDays(c*2));

        }
    }
    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        //assertEquals(this.pr0q.CAPACITY-1, this.pr0q.getQueue().size());
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());

        //assertEquals(this.pr0q.clearFullQueue(), new String("0 1 2 3 4 5 6 7 8 "));
        assertEquals(this.pr0q.clearFullQueue(), new String("2023-09-28 2023-09-30 2023-10-02 2023-10-04 2023-10-06 2023-10-08 2023-10-10 2023-10-12 2023-10-14 2023-10-16 "));

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
