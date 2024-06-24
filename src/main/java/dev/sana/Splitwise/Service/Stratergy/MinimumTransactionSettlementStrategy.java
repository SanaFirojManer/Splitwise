package dev.sana.Splitwise.Service.Stratergy;

import dev.sana.Splitwise.Entity.Expense;
import dev.sana.Splitwise.Entity.SettlementTransaction;

import java.util.List;

public class MinimumTransactionSettlementStrategy implements SettleUpStratergy{
    @Override
    public List<SettlementTransaction> getSettlementTransactions(List<Expense> expenses) {
        return List.of();
    }
}
