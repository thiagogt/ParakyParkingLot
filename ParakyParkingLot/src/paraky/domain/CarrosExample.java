package paraky.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarrosExample() {
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

        public Criteria andIdCarroIsNull() {
            addCriterion("id_carro is null");
            return (Criteria) this;
        }

        public Criteria andIdCarroIsNotNull() {
            addCriterion("id_carro is not null");
            return (Criteria) this;
        }

        public Criteria andIdCarroEqualTo(Integer value) {
            addCriterion("id_carro =", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroNotEqualTo(Integer value) {
            addCriterion("id_carro <>", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroGreaterThan(Integer value) {
            addCriterion("id_carro >", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_carro >=", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroLessThan(Integer value) {
            addCriterion("id_carro <", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroLessThanOrEqualTo(Integer value) {
            addCriterion("id_carro <=", value, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroIn(List<Integer> values) {
            addCriterion("id_carro in", values, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroNotIn(List<Integer> values) {
            addCriterion("id_carro not in", values, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroBetween(Integer value1, Integer value2) {
            addCriterion("id_carro between", value1, value2, "idCarro");
            return (Criteria) this;
        }

        public Criteria andIdCarroNotBetween(Integer value1, Integer value2) {
            addCriterion("id_carro not between", value1, value2, "idCarro");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNull() {
            addCriterion("placa is null");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNotNull() {
            addCriterion("placa is not null");
            return (Criteria) this;
        }

        public Criteria andPlacaEqualTo(String value) {
            addCriterion("placa =", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotEqualTo(String value) {
            addCriterion("placa <>", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThan(String value) {
            addCriterion("placa >", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThanOrEqualTo(String value) {
            addCriterion("placa >=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThan(String value) {
            addCriterion("placa <", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThanOrEqualTo(String value) {
            addCriterion("placa <=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLike(String value) {
            addCriterion("placa like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotLike(String value) {
            addCriterion("placa not like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaIn(List<String> values) {
            addCriterion("placa in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotIn(List<String> values) {
            addCriterion("placa not in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaBetween(String value1, String value2) {
            addCriterion("placa between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotBetween(String value1, String value2) {
            addCriterion("placa not between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andCorIsNull() {
            addCriterion("cor is null");
            return (Criteria) this;
        }

        public Criteria andCorIsNotNull() {
            addCriterion("cor is not null");
            return (Criteria) this;
        }

        public Criteria andCorEqualTo(String value) {
            addCriterion("cor =", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorNotEqualTo(String value) {
            addCriterion("cor <>", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorGreaterThan(String value) {
            addCriterion("cor >", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorGreaterThanOrEqualTo(String value) {
            addCriterion("cor >=", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorLessThan(String value) {
            addCriterion("cor <", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorLessThanOrEqualTo(String value) {
            addCriterion("cor <=", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorLike(String value) {
            addCriterion("cor like", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorNotLike(String value) {
            addCriterion("cor not like", value, "cor");
            return (Criteria) this;
        }

        public Criteria andCorIn(List<String> values) {
            addCriterion("cor in", values, "cor");
            return (Criteria) this;
        }

        public Criteria andCorNotIn(List<String> values) {
            addCriterion("cor not in", values, "cor");
            return (Criteria) this;
        }

        public Criteria andCorBetween(String value1, String value2) {
            addCriterion("cor between", value1, value2, "cor");
            return (Criteria) this;
        }

        public Criteria andCorNotBetween(String value1, String value2) {
            addCriterion("cor not between", value1, value2, "cor");
            return (Criteria) this;
        }

        public Criteria andModeloIsNull() {
            addCriterion("modelo is null");
            return (Criteria) this;
        }

        public Criteria andModeloIsNotNull() {
            addCriterion("modelo is not null");
            return (Criteria) this;
        }

        public Criteria andModeloEqualTo(String value) {
            addCriterion("modelo =", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotEqualTo(String value) {
            addCriterion("modelo <>", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloGreaterThan(String value) {
            addCriterion("modelo >", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloGreaterThanOrEqualTo(String value) {
            addCriterion("modelo >=", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLessThan(String value) {
            addCriterion("modelo <", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLessThanOrEqualTo(String value) {
            addCriterion("modelo <=", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloLike(String value) {
            addCriterion("modelo like", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotLike(String value) {
            addCriterion("modelo not like", value, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloIn(List<String> values) {
            addCriterion("modelo in", values, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotIn(List<String> values) {
            addCriterion("modelo not in", values, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloBetween(String value1, String value2) {
            addCriterion("modelo between", value1, value2, "modelo");
            return (Criteria) this;
        }

        public Criteria andModeloNotBetween(String value1, String value2) {
            addCriterion("modelo not between", value1, value2, "modelo");
            return (Criteria) this;
        }

        public Criteria andMarcaIsNull() {
            addCriterion("marca is null");
            return (Criteria) this;
        }

        public Criteria andMarcaIsNotNull() {
            addCriterion("marca is not null");
            return (Criteria) this;
        }

        public Criteria andMarcaEqualTo(String value) {
            addCriterion("marca =", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotEqualTo(String value) {
            addCriterion("marca <>", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaGreaterThan(String value) {
            addCriterion("marca >", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaGreaterThanOrEqualTo(String value) {
            addCriterion("marca >=", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLessThan(String value) {
            addCriterion("marca <", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLessThanOrEqualTo(String value) {
            addCriterion("marca <=", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaLike(String value) {
            addCriterion("marca like", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotLike(String value) {
            addCriterion("marca not like", value, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaIn(List<String> values) {
            addCriterion("marca in", values, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotIn(List<String> values) {
            addCriterion("marca not in", values, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaBetween(String value1, String value2) {
            addCriterion("marca between", value1, value2, "marca");
            return (Criteria) this;
        }

        public Criteria andMarcaNotBetween(String value1, String value2) {
            addCriterion("marca not between", value1, value2, "marca");
            return (Criteria) this;
        }

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(Integer value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(Integer value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(Integer value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(Integer value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(Integer value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<Integer> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<Integer> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(Integer value1, Integer value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ano not between", value1, value2, "ano");
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