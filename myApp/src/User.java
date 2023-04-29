class User {
    int id;
    String userName;
    User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }
    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isEqual(User user){
        boolean res = false;

        if(user.getId() == this.id){
            res = true;
        }
        if(!(user.getId() == this.id)){
            res = false;
        }
        return res;
    }

}
