class Task {
    Logger logger;

    public Task(Logger logger){
        this.logger = logger;
    }
    public void runTask(){
        for(Integer i=0;i<10;i++){
            logger.log("Task nr " + i + " done successfully");
        }
    }
}
