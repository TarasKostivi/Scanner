package Account;

import java.util.List;

public interface UserServise<T extends Account, V>
{
    List<V> getAllUsers();
    List<V> getAllAccounts();
    double tax(V user);

}
