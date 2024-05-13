public class ToDoList {
    String name;
    Task[] tasks;
    int taskCount;
    public ToDoList(String name,int max_number){
        this.name= name;
        tasks= new Task[max_number];
    }

    public void addTask(Task task){
        if(taskCount< tasks.length){
            tasks[taskCount]=task;
            taskCount++;
        }else{
            System.out.println("Keni arritur limit e tasqeve");
        }
    }
    public  void removeTask(int index){
        if(index>=0 && index<taskCount){
            for(int i =index;i<taskCount;i++){
                tasks[i]=tasks[i+1];
            }
            tasks[taskCount-1]=null;
            taskCount--;
        }
    }
    public  void displayTasks(){
        System.out.println("Tasqet ne :"+name+" jane :");
        for (int i =0;i<taskCount;i++){
            tasks[i].display();
        }
    }

    public Task getTask(int index){
        if(index>=0 && index<taskCount){
            return tasks[index];
        }else{
            return  null;
        }
    }
}
