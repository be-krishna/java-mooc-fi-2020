/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Timer {

    private ClockHand hundredSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundredSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredSeconds.advance();

        if (this.hundredSeconds.value() == 0) {
            this.seconds.advance();

        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredSeconds;
    }
}
