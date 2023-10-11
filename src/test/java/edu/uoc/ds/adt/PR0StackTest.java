package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        for (int c = 0; c < 10; c++) {
            //pr0q.push(Character.valueOf(c));
            pr0q.push(LocalDate.of(2023, 9, 28).plusDays(c*2));
        }
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        //assertEquals(this.pr0q.CAPACITY-1, this.pr0q.getStack().size());
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getStack().size());

        //assertEquals(this.pr0q.clearAllStack(), new String("8 7 6 5 4 3 2 1 0 "));
        assertEquals(this.pr0q.clearAllStack(), new String("2023-10-16 2023-10-14 2023-10-12 2023-10-10 2023-10-08 2023-10-06 2023-10-04 2023-10-02 2023-09-30 2023-09-28 "));

        assertEquals(0, this.pr0q.getStack().size());
    }
}
