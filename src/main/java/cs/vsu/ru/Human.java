package cs.vsu.ru;

/**
 * Класс человек со свойствами
 * id- Хранящий id человека
 * name- имя человека
 * gender- пол человека
 * birDate-день рождения
 * division -подразделение
 * salary -зарплата
 */

public class Human {
    private Integer id;
    private String name;
    private String gender;
    private String birDate;
    private Division division;
    private Integer salary;

    /**
     * Конструктор позволяющий создать новый экземпляр класса
     *  @param  id- Хранящий id человека
     *  @param  name- имя человека
     *  @param gender- пол человека
     *  @param birDate-день рождения
     *  @param nameDivision -подразделение
     *  @param  salary -зарплата
     *
     */
    public Human(String id, String name, String gender, String birDate, String nameDivision, String salary) {
        this.id = Integer.valueOf(id);
        this.name = name;
        this.gender = gender;
        this.birDate = birDate;
        Division division=new Division(nameDivision);
        this.division=division;
        this.salary = Integer.valueOf(salary);;
    }

    /**
     * Метод, получающий ID человека
     * @return айди сотрудника
     */
    public Integer getId() {
        return id;
    }

    /**
     * Метод, устанавливающий ID
     * @param id- айди
     */
    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

    /**
     * Метод, получающий имя человека
     * @return имя сотрудника
     */
    public String getName() {
        return name;
    }

    /**
     * Метод, устанавливающий имя человеку
     * @param name- имя человека
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод, получающий пол человека
     * @return пол сотрудника
     */
    public String getGender() {
        return gender;
    }

    /**
     * Метод, устанавливающий пол человеку
     * @param gender- пол
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Метод, получающий ДР человека
     * @return дату Дня рождения сотрудника
     */
    public String getBirDate() {
        return birDate;
    }

    /**
     * Метод, устанавливающий ДР человеку
     *  @param birDate - день рожднения
     */
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    /**
     * Метод, получающий подразделение человека
     * @return подразделение, в котором работает человек
     */
    public Division getDivision() {
        return division;
    }

    /**
     * Метод, устанавливающий подразделение человеку
     *  @param divisionName- имя подразделения
     */
    public void setDivision(String divisionName) {
        division.setName(divisionName);
        division.setID( (int)(Math.random()*((10000-1000)+1))+1000);
    }

    /**
     * Метод, плучающий зарплату человеку
     * @return зарплату сотрудника
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * Метод, устанавливающий зарплату человеку
     * @param salary - зарплата
     */
    public void setSalary(String salary) {
        this.salary = Integer.valueOf(salary);
    }

}
