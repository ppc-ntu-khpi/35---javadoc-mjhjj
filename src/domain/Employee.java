package domain;

/**
 * Клас, що являє собою співробітника
 * @author Maksim 
 */
public class Employee {
    
    /**
     * Відображає інформацію про співробітника
     * @return рядок з інформацією про співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * Конструктор з параметрами
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень співробітника
     * @param dept відділ співробітника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    
    /**
     * Конструктор
     * Ініціалізує ідентифікатор співробітника як випадкове число від 1 до 1000
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    
    /**
     * Метод, для встановлення посади співробітника
     * @param job назва роботи
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    
    /**
     * Метод для отримання посади співробітника
     * @return назва роботи
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    /**
     * Метод, для отримання ім'я співробітника
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }
    
    /**
     * Метод, для встановлення рівня співробітника
     * @param level рівень співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    
    /**
     * Метод, для отримання рівня співробітника
     * @return рівень співробітника
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Метод, для отримання відділу співробітника
     * @return відділ співробітника
     */
    public String getDept() {
        return dept;
    }
    
    /**
     * Метод, для встановлення відділу співробітника
     * @param dept відділ співробітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * Метод, для встановлення ім'я співробітника
     * @param name ім'я співробітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}