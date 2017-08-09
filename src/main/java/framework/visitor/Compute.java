package framework.visitor;

/**
 * Created by yf_zh on 2017/08/09.
 */
public interface Compute<K,J> {
    public void visitSavingAccount(K k);
    public void visitCheckAccount(J j);
}
