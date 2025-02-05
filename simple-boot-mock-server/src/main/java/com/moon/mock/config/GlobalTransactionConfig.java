package com.moon.mock.config;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

@Configuration
public class GlobalTransactionConfig {

    /**
     * 注入已经存在的事务管理器
     */
    @Autowired
    private PlatformTransactionManager transactionManager;

    @Bean
    public TransactionInterceptor txAdvice() {
        // 开启事务方法
        TransactionAttribute requiredTransaction = new DefaultTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED);
        NameMatchTransactionAttributeSource nameMatchSource = new NameMatchTransactionAttributeSource();
        nameMatchSource.addTransactionalMethod("save*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("delete*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("remove*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("update*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("add*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("create*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("insert*", requiredTransaction);
        nameMatchSource.addTransactionalMethod("mark*", requiredTransaction);
        // ReadOnly事务方法
        DefaultTransactionAttribute readonlyTransaction = new DefaultTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED);
        readonlyTransaction.setReadOnly(true);
        nameMatchSource.addTransactionalMethod("get*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("query*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("list*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("count*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("page*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("find*", readonlyTransaction);
        nameMatchSource.addTransactionalMethod("load*", readonlyTransaction);
        return new TransactionInterceptor(transactionManager, nameMatchSource);
    }

    @Bean
    public Advisor txAdviceAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution (* com..service..*.*(..))");
        return new DefaultPointcutAdvisor(pointcut, txAdvice());
    }
}
