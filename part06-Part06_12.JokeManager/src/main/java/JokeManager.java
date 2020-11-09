import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class JokeManager {
    private ArrayList<String> jokesRepo;

    public JokeManager() {
        this.jokesRepo = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokesRepo.add(joke);
    }
    
    public String drawJoke(){
        
        if(jokesRepo.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        int index = rand.nextInt(jokesRepo.size());
        
        String randomJoke = jokesRepo.get(index);
        
        return randomJoke;
    }
    
    public void printJokes(){
        for(String joke: jokesRepo){
            System.out.println(joke);
        }
    }
}
