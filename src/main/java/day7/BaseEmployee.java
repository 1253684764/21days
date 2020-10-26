package day7;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author ALIENWARE
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print() {
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * <p>
     * return int
     */
    public abstract int getSalary();
}
