package dev.sana.Splitwise.Service.Stratergy;

import dev.sana.Splitwise.Entity.Expense;
import dev.sana.Splitwise.Entity.SettlementTransaction;

import java.util.List;

public interface SettleUpStratergy {
    List<SettlementTransaction> getSettlementTransactions(List<Expense> expenses);
}
