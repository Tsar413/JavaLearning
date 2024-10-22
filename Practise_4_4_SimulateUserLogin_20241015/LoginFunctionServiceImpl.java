package com.company.javaRelearn.Practise_4_4_SimulateUserLogin_20241015;

public class LoginFunctionServiceImpl implements LoginFunctionService {
    private int chance = 3;

    @Override
    public String loginJudge(User user1, User user2) {
        if(user1.getUsername().equals(user2.getUsername()) && (user1.getPassword().equals(user2.getPassword()))){
            return "Login Success";
        }
        if(chance > 0){
            chance--;
            return "Final " + chance;
        }
        return "Contact to Admin";
    }
}
