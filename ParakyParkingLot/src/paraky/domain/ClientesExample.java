package paraky.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("id_cliente is null");
            return (Criteria) this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("id_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andIdClienteEqualTo(Integer value) {
            addCriterion("id_cliente =", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotEqualTo(Integer value) {
            addCriterion("id_cliente <>", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThan(Integer value) {
            addCriterion("id_cliente >", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cliente >=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThan(Integer value) {
            addCriterion("id_cliente <", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Integer value) {
            addCriterion("id_cliente <=", value, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteIn(List<Integer> values) {
            addCriterion("id_cliente in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotIn(List<Integer> values) {
            addCriterion("id_cliente not in", values, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andIdClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente not between", value1, value2, "idCliente");
            return (Criteria) this;
        }

        public Criteria andNomeIsNull() {
            addCriterion("nome is null");
            return (Criteria) this;
        }

        public Criteria andNomeIsNotNull() {
            addCriterion("nome is not null");
            return (Criteria) this;
        }

        public Criteria andNomeEqualTo(String value) {
            addCriterion("nome =", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotEqualTo(String value) {
            addCriterion("nome <>", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThan(String value) {
            addCriterion("nome >", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeGreaterThanOrEqualTo(String value) {
            addCriterion("nome >=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThan(String value) {
            addCriterion("nome <", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLessThanOrEqualTo(String value) {
            addCriterion("nome <=", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeLike(String value) {
            addCriterion("nome like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotLike(String value) {
            addCriterion("nome not like", value, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeIn(List<String> values) {
            addCriterion("nome in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotIn(List<String> values) {
            addCriterion("nome not in", values, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeBetween(String value1, String value2) {
            addCriterion("nome between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andNomeNotBetween(String value1, String value2) {
            addCriterion("nome not between", value1, value2, "nome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeIsNull() {
            addCriterion("sobrenome is null");
            return (Criteria) this;
        }

        public Criteria andSobrenomeIsNotNull() {
            addCriterion("sobrenome is not null");
            return (Criteria) this;
        }

        public Criteria andSobrenomeEqualTo(String value) {
            addCriterion("sobrenome =", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeNotEqualTo(String value) {
            addCriterion("sobrenome <>", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeGreaterThan(String value) {
            addCriterion("sobrenome >", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeGreaterThanOrEqualTo(String value) {
            addCriterion("sobrenome >=", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeLessThan(String value) {
            addCriterion("sobrenome <", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeLessThanOrEqualTo(String value) {
            addCriterion("sobrenome <=", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeLike(String value) {
            addCriterion("sobrenome like", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeNotLike(String value) {
            addCriterion("sobrenome not like", value, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeIn(List<String> values) {
            addCriterion("sobrenome in", values, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeNotIn(List<String> values) {
            addCriterion("sobrenome not in", values, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeBetween(String value1, String value2) {
            addCriterion("sobrenome between", value1, value2, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andSobrenomeNotBetween(String value1, String value2) {
            addCriterion("sobrenome not between", value1, value2, "sobrenome");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaIsNull() {
            addCriterion("titular_da_vaga is null");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaIsNotNull() {
            addCriterion("titular_da_vaga is not null");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaEqualTo(Boolean value) {
            addCriterion("titular_da_vaga =", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaNotEqualTo(Boolean value) {
            addCriterion("titular_da_vaga <>", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaGreaterThan(Boolean value) {
            addCriterion("titular_da_vaga >", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("titular_da_vaga >=", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaLessThan(Boolean value) {
            addCriterion("titular_da_vaga <", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaLessThanOrEqualTo(Boolean value) {
            addCriterion("titular_da_vaga <=", value, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaIn(List<Boolean> values) {
            addCriterion("titular_da_vaga in", values, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaNotIn(List<Boolean> values) {
            addCriterion("titular_da_vaga not in", values, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaBetween(Boolean value1, Boolean value2) {
            addCriterion("titular_da_vaga between", value1, value2, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andTitularDaVagaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("titular_da_vaga not between", value1, value2, "titularDaVaga");
            return (Criteria) this;
        }

        public Criteria andAniversarioIsNull() {
            addCriterion("aniversario is null");
            return (Criteria) this;
        }

        public Criteria andAniversarioIsNotNull() {
            addCriterion("aniversario is not null");
            return (Criteria) this;
        }

        public Criteria andAniversarioEqualTo(Date value) {
            addCriterionForJDBCDate("aniversario =", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioNotEqualTo(Date value) {
            addCriterionForJDBCDate("aniversario <>", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioGreaterThan(Date value) {
            addCriterionForJDBCDate("aniversario >", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aniversario >=", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioLessThan(Date value) {
            addCriterionForJDBCDate("aniversario <", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aniversario <=", value, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioIn(List<Date> values) {
            addCriterionForJDBCDate("aniversario in", values, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioNotIn(List<Date> values) {
            addCriterionForJDBCDate("aniversario not in", values, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aniversario between", value1, value2, "aniversario");
            return (Criteria) this;
        }

        public Criteria andAniversarioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aniversario not between", value1, value2, "aniversario");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}