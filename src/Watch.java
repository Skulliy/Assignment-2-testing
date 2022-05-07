public class Watch {

    private String state = "normal";
    private String innerstate = "Time";
    private int m = 0, h = 0, D = 1, M = 1 , Y = 2000;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInnerstate() {
        return innerstate;
    }

    public void setInnerstate(String innerstate) {
        this.innerstate = innerstate;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }
    public int getm() {
        return m;
    }

    public void setm(int m) {
        this.m = m;
    }
    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }
}
