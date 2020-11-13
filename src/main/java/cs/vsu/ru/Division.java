package cs.vsu.ru;

/**
 * Класс подразделение со свойствами
 * id- хранящий id подразделения
 * name- название подразделения
 */
public class Division {
    private int ID;
    private String name;

    public Division(String name) {
        this.name = name;
        this.ID=(int)(Math.random()*((10000-1000)+1))+1000;
    }

    /**
     * Метод, получающий ID подразделения
     * @return айди подразделения
     */
    public int getID() {
        return ID;
    }
    /**
     * Метод, устанавливающий ID
     * @param ID- айди
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Метод, получающий название подразделения
     * @return название подразделения
     */
    public String getName() {
        return name;
    }

    /**
     * Метод, устанавливающий название подразделению
     * @param name- название подразделения
     */
    public void setName(String name) {
        this.name = name;
    }
}
