package paraky.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BoletosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoletosExample() {
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

        public Criteria andIdBoletoIsNull() {
            addCriterion("id_boleto is null");
            return (Criteria) this;
        }

        public Criteria andIdBoletoIsNotNull() {
            addCriterion("id_boleto is not null");
            return (Criteria) this;
        }

        public Criteria andIdBoletoEqualTo(Integer value) {
            addCriterion("id_boleto =", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoNotEqualTo(Integer value) {
            addCriterion("id_boleto <>", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoGreaterThan(Integer value) {
            addCriterion("id_boleto >", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_boleto >=", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoLessThan(Integer value) {
            addCriterion("id_boleto <", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoLessThanOrEqualTo(Integer value) {
            addCriterion("id_boleto <=", value, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoIn(List<Integer> values) {
            addCriterion("id_boleto in", values, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoNotIn(List<Integer> values) {
            addCriterion("id_boleto not in", values, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoBetween(Integer value1, Integer value2) {
            addCriterion("id_boleto between", value1, value2, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdBoletoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_boleto not between", value1, value2, "idBoleto");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaIsNull() {
            addCriterion("id_familia is null");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaIsNotNull() {
            addCriterion("id_familia is not null");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaEqualTo(Integer value) {
            addCriterion("id_familia =", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaNotEqualTo(Integer value) {
            addCriterion("id_familia <>", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaGreaterThan(Integer value) {
            addCriterion("id_familia >", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_familia >=", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaLessThan(Integer value) {
            addCriterion("id_familia <", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaLessThanOrEqualTo(Integer value) {
            addCriterion("id_familia <=", value, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaIn(List<Integer> values) {
            addCriterion("id_familia in", values, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaNotIn(List<Integer> values) {
            addCriterion("id_familia not in", values, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaBetween(Integer value1, Integer value2) {
            addCriterion("id_familia between", value1, value2, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andIdFamiliaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_familia not between", value1, value2, "idFamilia");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoIsNull() {
            addCriterion("data_do_pagamento is null");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoIsNotNull() {
            addCriterion("data_do_pagamento is not null");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoEqualTo(Date value) {
            addCriterionForJDBCDate("data_do_pagamento =", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_do_pagamento <>", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoGreaterThan(Date value) {
            addCriterionForJDBCDate("data_do_pagamento >", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_do_pagamento >=", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoLessThan(Date value) {
            addCriterionForJDBCDate("data_do_pagamento <", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_do_pagamento <=", value, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoIn(List<Date> values) {
            addCriterionForJDBCDate("data_do_pagamento in", values, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_do_pagamento not in", values, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_do_pagamento between", value1, value2, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andDataDoPagamentoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_do_pagamento not between", value1, value2, "dataDoPagamento");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoIsNull() {
            addCriterion("boleto_pago is null");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoIsNotNull() {
            addCriterion("boleto_pago is not null");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoEqualTo(Boolean value) {
            addCriterion("boleto_pago =", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoNotEqualTo(Boolean value) {
            addCriterion("boleto_pago <>", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoGreaterThan(Boolean value) {
            addCriterion("boleto_pago >", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("boleto_pago >=", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoLessThan(Boolean value) {
            addCriterion("boleto_pago <", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoLessThanOrEqualTo(Boolean value) {
            addCriterion("boleto_pago <=", value, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoIn(List<Boolean> values) {
            addCriterion("boleto_pago in", values, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoNotIn(List<Boolean> values) {
            addCriterion("boleto_pago not in", values, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoBetween(Boolean value1, Boolean value2) {
            addCriterion("boleto_pago between", value1, value2, "boletoPago");
            return (Criteria) this;
        }

        public Criteria andBoletoPagoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("boleto_pago not between", value1, value2, "boletoPago");
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