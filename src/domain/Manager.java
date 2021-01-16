package domain;

/**
 * Підклас Employee, що являє собою менеджера
 * @see Employee
 * @author Maksim
 */
public class Manager extends Employee {

    /**
     * Конструктор, який ініціалізує новий об'єкт
     * @param employees співробітники
     * @param name ім'я співробітника
     * @param jobTitle посада співробітника
     * @param level рівень співробітника
     * @param dept відділ співробітника
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    
    /**
     * Перетворення інформації про співробітників в рядок
     * @return рядок з інформацією про співробітників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює новий об'єкт з параметром
     * @param employees співробітники менеджера
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює новий об'єкт
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * Метод, для отримання імен співробітників
     * @return імена співробітників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод, для встановлення співробітників менеджера
     * @param employees співробітники менеджера
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Метод, для отримання списку співробітників
     * @return список співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}