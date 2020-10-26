package day7;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @org.junit.Test
    public void print() {
    }

    @org.junit.Test
    public void getSalary() {
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000, be.getSalary());
    }
}