package domain;

/**
 * Підклас Employee, що являє собою художника
 * @see Employee
 * @author Maksim 
 */
public class Artist extends Employee {
    
    /**
     * Конструктор, який ініціалізує новий об'єкт
     * @param skiils навички художника
     * @param name ім'я художника
     * @param jobTitle посада художника
     * @param level рівень художника
     * @param dept відділ художника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт з параметрами навичок
     * @param skiils навички художника 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * Перетворення інформації про виконавця в рядок
     * @return рядок з інформацією про виконавця
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**
     * Метод, який повертає навички художника в рядку
     * @return навички художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Метод, для встановлення навичок художника
     * @param skills навички художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Метод, для отримання списку навичок художника
     * @return список навыков
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}