package bean;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class Boy {

    private String name;
    private String aihao;

    public Boy(String name, String aihao) {
        this.name = name;
        this.aihao = aihao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }
}
