package framework.state;

/**
 * Created by yf_zh on 2017/08/09.
 */
public interface AccountState {
    public void deposit(double amount, String accnr);
    public boolean withdraw(double amount, String accnr);
    public void computeInterest();
    public void stateCheck(double amount);
}
