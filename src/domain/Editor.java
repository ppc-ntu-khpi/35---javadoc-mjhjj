package domain;

/**
 * Підклас Artist, що являє собою редактора
 * @see Artist
 * @author Maksim 
 */
public class Editor extends Artist {
    
    /**
     * Конструктор, що ініціалізує новий об'єкт
     * @param electronicEditing статус елкектронного редагування
     * @param skiils навички редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ редакції
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт з електронним редагуванням і навичками
     * @param electronicEditing статус електронного редагування
     * @param skiils навички редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт з елетронним редагуванням параметрів
     * @param electronicEditing статус електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт і створює електронне редагування
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /**
     * Перетворення інформації про людину з інформацією про навички і статус електронного редагування в рядок
     * @return рядок з інформацією про людину
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Метод, який отримує статус електронного редагування
     * @return логічне значення електронного редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Метод, для встановлення статусу електронного редагування
     * @param electronic статус електронного редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}