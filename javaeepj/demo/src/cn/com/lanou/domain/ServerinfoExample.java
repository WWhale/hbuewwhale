package cn.com.lanou.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCpuusageIsNull() {
            addCriterion("cpuUsage is null");
            return (Criteria) this;
        }

        public Criteria andCpuusageIsNotNull() {
            addCriterion("cpuUsage is not null");
            return (Criteria) this;
        }

        public Criteria andCpuusageEqualTo(String value) {
            addCriterion("cpuUsage =", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotEqualTo(String value) {
            addCriterion("cpuUsage <>", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageGreaterThan(String value) {
            addCriterion("cpuUsage >", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageGreaterThanOrEqualTo(String value) {
            addCriterion("cpuUsage >=", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLessThan(String value) {
            addCriterion("cpuUsage <", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLessThanOrEqualTo(String value) {
            addCriterion("cpuUsage <=", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageLike(String value) {
            addCriterion("cpuUsage like", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotLike(String value) {
            addCriterion("cpuUsage not like", value, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageIn(List<String> values) {
            addCriterion("cpuUsage in", values, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotIn(List<String> values) {
            addCriterion("cpuUsage not in", values, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageBetween(String value1, String value2) {
            addCriterion("cpuUsage between", value1, value2, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andCpuusageNotBetween(String value1, String value2) {
            addCriterion("cpuUsage not between", value1, value2, "cpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageIsNull() {
            addCriterion("setCpuUsage is null");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageIsNotNull() {
            addCriterion("setCpuUsage is not null");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageEqualTo(String value) {
            addCriterion("setCpuUsage =", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageNotEqualTo(String value) {
            addCriterion("setCpuUsage <>", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageGreaterThan(String value) {
            addCriterion("setCpuUsage >", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageGreaterThanOrEqualTo(String value) {
            addCriterion("setCpuUsage >=", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageLessThan(String value) {
            addCriterion("setCpuUsage <", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageLessThanOrEqualTo(String value) {
            addCriterion("setCpuUsage <=", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageLike(String value) {
            addCriterion("setCpuUsage like", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageNotLike(String value) {
            addCriterion("setCpuUsage not like", value, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageIn(List<String> values) {
            addCriterion("setCpuUsage in", values, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageNotIn(List<String> values) {
            addCriterion("setCpuUsage not in", values, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageBetween(String value1, String value2) {
            addCriterion("setCpuUsage between", value1, value2, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andSetcpuusageNotBetween(String value1, String value2) {
            addCriterion("setCpuUsage not between", value1, value2, "setcpuusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageIsNull() {
            addCriterion("jvmUsage is null");
            return (Criteria) this;
        }

        public Criteria andJvmusageIsNotNull() {
            addCriterion("jvmUsage is not null");
            return (Criteria) this;
        }

        public Criteria andJvmusageEqualTo(String value) {
            addCriterion("jvmUsage =", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageNotEqualTo(String value) {
            addCriterion("jvmUsage <>", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageGreaterThan(String value) {
            addCriterion("jvmUsage >", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageGreaterThanOrEqualTo(String value) {
            addCriterion("jvmUsage >=", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageLessThan(String value) {
            addCriterion("jvmUsage <", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageLessThanOrEqualTo(String value) {
            addCriterion("jvmUsage <=", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageLike(String value) {
            addCriterion("jvmUsage like", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageNotLike(String value) {
            addCriterion("jvmUsage not like", value, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageIn(List<String> values) {
            addCriterion("jvmUsage in", values, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageNotIn(List<String> values) {
            addCriterion("jvmUsage not in", values, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageBetween(String value1, String value2) {
            addCriterion("jvmUsage between", value1, value2, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andJvmusageNotBetween(String value1, String value2) {
            addCriterion("jvmUsage not between", value1, value2, "jvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageIsNull() {
            addCriterion("setJvmUsage is null");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageIsNotNull() {
            addCriterion("setJvmUsage is not null");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageEqualTo(String value) {
            addCriterion("setJvmUsage =", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageNotEqualTo(String value) {
            addCriterion("setJvmUsage <>", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageGreaterThan(String value) {
            addCriterion("setJvmUsage >", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageGreaterThanOrEqualTo(String value) {
            addCriterion("setJvmUsage >=", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageLessThan(String value) {
            addCriterion("setJvmUsage <", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageLessThanOrEqualTo(String value) {
            addCriterion("setJvmUsage <=", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageLike(String value) {
            addCriterion("setJvmUsage like", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageNotLike(String value) {
            addCriterion("setJvmUsage not like", value, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageIn(List<String> values) {
            addCriterion("setJvmUsage in", values, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageNotIn(List<String> values) {
            addCriterion("setJvmUsage not in", values, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageBetween(String value1, String value2) {
            addCriterion("setJvmUsage between", value1, value2, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andSetjvmusageNotBetween(String value1, String value2) {
            addCriterion("setJvmUsage not between", value1, value2, "setjvmusage");
            return (Criteria) this;
        }

        public Criteria andRamusageIsNull() {
            addCriterion("ramUsage is null");
            return (Criteria) this;
        }

        public Criteria andRamusageIsNotNull() {
            addCriterion("ramUsage is not null");
            return (Criteria) this;
        }

        public Criteria andRamusageEqualTo(String value) {
            addCriterion("ramUsage =", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageNotEqualTo(String value) {
            addCriterion("ramUsage <>", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageGreaterThan(String value) {
            addCriterion("ramUsage >", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageGreaterThanOrEqualTo(String value) {
            addCriterion("ramUsage >=", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageLessThan(String value) {
            addCriterion("ramUsage <", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageLessThanOrEqualTo(String value) {
            addCriterion("ramUsage <=", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageLike(String value) {
            addCriterion("ramUsage like", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageNotLike(String value) {
            addCriterion("ramUsage not like", value, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageIn(List<String> values) {
            addCriterion("ramUsage in", values, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageNotIn(List<String> values) {
            addCriterion("ramUsage not in", values, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageBetween(String value1, String value2) {
            addCriterion("ramUsage between", value1, value2, "ramusage");
            return (Criteria) this;
        }

        public Criteria andRamusageNotBetween(String value1, String value2) {
            addCriterion("ramUsage not between", value1, value2, "ramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageIsNull() {
            addCriterion("setRamUsage is null");
            return (Criteria) this;
        }

        public Criteria andSetramusageIsNotNull() {
            addCriterion("setRamUsage is not null");
            return (Criteria) this;
        }

        public Criteria andSetramusageEqualTo(String value) {
            addCriterion("setRamUsage =", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageNotEqualTo(String value) {
            addCriterion("setRamUsage <>", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageGreaterThan(String value) {
            addCriterion("setRamUsage >", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageGreaterThanOrEqualTo(String value) {
            addCriterion("setRamUsage >=", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageLessThan(String value) {
            addCriterion("setRamUsage <", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageLessThanOrEqualTo(String value) {
            addCriterion("setRamUsage <=", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageLike(String value) {
            addCriterion("setRamUsage like", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageNotLike(String value) {
            addCriterion("setRamUsage not like", value, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageIn(List<String> values) {
            addCriterion("setRamUsage in", values, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageNotIn(List<String> values) {
            addCriterion("setRamUsage not in", values, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageBetween(String value1, String value2) {
            addCriterion("setRamUsage between", value1, value2, "setramusage");
            return (Criteria) this;
        }

        public Criteria andSetramusageNotBetween(String value1, String value2) {
            addCriterion("setRamUsage not between", value1, value2, "setramusage");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNull() {
            addCriterion("operTime is null");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNotNull() {
            addCriterion("operTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpertimeEqualTo(Date value) {
            addCriterion("operTime =", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotEqualTo(Date value) {
            addCriterion("operTime <>", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThan(Date value) {
            addCriterion("operTime >", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operTime >=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThan(Date value) {
            addCriterion("operTime <", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThanOrEqualTo(Date value) {
            addCriterion("operTime <=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeIn(List<Date> values) {
            addCriterion("operTime in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotIn(List<Date> values) {
            addCriterion("operTime not in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeBetween(Date value1, Date value2) {
            addCriterion("operTime between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotBetween(Date value1, Date value2) {
            addCriterion("operTime not between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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