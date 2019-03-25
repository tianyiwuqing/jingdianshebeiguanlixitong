package com.lynu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableEquipmentDetalisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableEquipmentDetalisExample() {
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("equipment_id like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("equipment_id not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNull() {
            addCriterion("equipment_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIsNotNull() {
            addCriterion("equipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeEqualTo(Integer value) {
            addCriterion("equipment_type =", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotEqualTo(Integer value) {
            addCriterion("equipment_type <>", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThan(Integer value) {
            addCriterion("equipment_type >", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_type >=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThan(Integer value) {
            addCriterion("equipment_type <", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_type <=", value, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIn(List<Integer> values) {
            addCriterion("equipment_type in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotIn(List<Integer> values) {
            addCriterion("equipment_type not in", values, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_type not between", value1, value2, "equipmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIsNull() {
            addCriterion("equipment_furnish is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIsNotNull() {
            addCriterion("equipment_furnish is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishEqualTo(Integer value) {
            addCriterion("equipment_furnish =", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotEqualTo(Integer value) {
            addCriterion("equipment_furnish <>", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishGreaterThan(Integer value) {
            addCriterion("equipment_furnish >", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_furnish >=", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishLessThan(Integer value) {
            addCriterion("equipment_furnish <", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_furnish <=", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIn(List<Integer> values) {
            addCriterion("equipment_furnish in", values, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotIn(List<Integer> values) {
            addCriterion("equipment_furnish not in", values, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishBetween(Integer value1, Integer value2) {
            addCriterion("equipment_furnish between", value1, value2, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_furnish not between", value1, value2, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandIsNull() {
            addCriterion("equipment_brand is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandIsNotNull() {
            addCriterion("equipment_brand is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandEqualTo(String value) {
            addCriterion("equipment_brand =", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandNotEqualTo(String value) {
            addCriterion("equipment_brand <>", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandGreaterThan(String value) {
            addCriterion("equipment_brand >", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_brand >=", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandLessThan(String value) {
            addCriterion("equipment_brand <", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandLessThanOrEqualTo(String value) {
            addCriterion("equipment_brand <=", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandLike(String value) {
            addCriterion("equipment_brand like", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandNotLike(String value) {
            addCriterion("equipment_brand not like", value, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandIn(List<String> values) {
            addCriterion("equipment_brand in", values, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandNotIn(List<String> values) {
            addCriterion("equipment_brand not in", values, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandBetween(String value1, String value2) {
            addCriterion("equipment_brand between", value1, value2, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andEquipmentBrandNotBetween(String value1, String value2) {
            addCriterion("equipment_brand not between", value1, value2, "equipmentBrand");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(Integer value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(Integer value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(Integer value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(Integer value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<Integer> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<Integer> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNull() {
            addCriterion("productDate is null");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNotNull() {
            addCriterion("productDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductdateEqualTo(Date value) {
            addCriterion("productDate =", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotEqualTo(Date value) {
            addCriterion("productDate <>", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThan(Date value) {
            addCriterion("productDate >", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThanOrEqualTo(Date value) {
            addCriterion("productDate >=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThan(Date value) {
            addCriterion("productDate <", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThanOrEqualTo(Date value) {
            addCriterion("productDate <=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateIn(List<Date> values) {
            addCriterion("productDate in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotIn(List<Date> values) {
            addCriterion("productDate not in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateBetween(Date value1, Date value2) {
            addCriterion("productDate between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotBetween(Date value1, Date value2) {
            addCriterion("productDate not between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNull() {
            addCriterion("useDate is null");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNotNull() {
            addCriterion("useDate is not null");
            return (Criteria) this;
        }

        public Criteria andUsedateEqualTo(Date value) {
            addCriterion("useDate =", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotEqualTo(Date value) {
            addCriterion("useDate <>", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThan(Date value) {
            addCriterion("useDate >", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThanOrEqualTo(Date value) {
            addCriterion("useDate >=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThan(Date value) {
            addCriterion("useDate <", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThanOrEqualTo(Date value) {
            addCriterion("useDate <=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateIn(List<Date> values) {
            addCriterion("useDate in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotIn(List<Date> values) {
            addCriterion("useDate not in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateBetween(Date value1, Date value2) {
            addCriterion("useDate between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotBetween(Date value1, Date value2) {
            addCriterion("useDate not between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andFixTypeIsNull() {
            addCriterion("fix_type is null");
            return (Criteria) this;
        }

        public Criteria andFixTypeIsNotNull() {
            addCriterion("fix_type is not null");
            return (Criteria) this;
        }

        public Criteria andFixTypeEqualTo(Integer value) {
            addCriterion("fix_type =", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeNotEqualTo(Integer value) {
            addCriterion("fix_type <>", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeGreaterThan(Integer value) {
            addCriterion("fix_type >", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fix_type >=", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeLessThan(Integer value) {
            addCriterion("fix_type <", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fix_type <=", value, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeIn(List<Integer> values) {
            addCriterion("fix_type in", values, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeNotIn(List<Integer> values) {
            addCriterion("fix_type not in", values, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeBetween(Integer value1, Integer value2) {
            addCriterion("fix_type between", value1, value2, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fix_type not between", value1, value2, "fixType");
            return (Criteria) this;
        }

        public Criteria andFixenddateIsNull() {
            addCriterion("fixendDate is null");
            return (Criteria) this;
        }

        public Criteria andFixenddateIsNotNull() {
            addCriterion("fixendDate is not null");
            return (Criteria) this;
        }

        public Criteria andFixenddateEqualTo(Date value) {
            addCriterion("fixendDate =", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateNotEqualTo(Date value) {
            addCriterion("fixendDate <>", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateGreaterThan(Date value) {
            addCriterion("fixendDate >", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fixendDate >=", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateLessThan(Date value) {
            addCriterion("fixendDate <", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateLessThanOrEqualTo(Date value) {
            addCriterion("fixendDate <=", value, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateIn(List<Date> values) {
            addCriterion("fixendDate in", values, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateNotIn(List<Date> values) {
            addCriterion("fixendDate not in", values, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateBetween(Date value1, Date value2) {
            addCriterion("fixendDate between", value1, value2, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixenddateNotBetween(Date value1, Date value2) {
            addCriterion("fixendDate not between", value1, value2, "fixenddate");
            return (Criteria) this;
        }

        public Criteria andFixtimeIsNull() {
            addCriterion("fixtime is null");
            return (Criteria) this;
        }

        public Criteria andFixtimeIsNotNull() {
            addCriterion("fixtime is not null");
            return (Criteria) this;
        }

        public Criteria andFixtimeEqualTo(String value) {
            addCriterion("fixtime =", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeNotEqualTo(String value) {
            addCriterion("fixtime <>", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeGreaterThan(String value) {
            addCriterion("fixtime >", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeGreaterThanOrEqualTo(String value) {
            addCriterion("fixtime >=", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeLessThan(String value) {
            addCriterion("fixtime <", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeLessThanOrEqualTo(String value) {
            addCriterion("fixtime <=", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeLike(String value) {
            addCriterion("fixtime like", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeNotLike(String value) {
            addCriterion("fixtime not like", value, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeIn(List<String> values) {
            addCriterion("fixtime in", values, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeNotIn(List<String> values) {
            addCriterion("fixtime not in", values, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeBetween(String value1, String value2) {
            addCriterion("fixtime between", value1, value2, "fixtime");
            return (Criteria) this;
        }

        public Criteria andFixtimeNotBetween(String value1, String value2) {
            addCriterion("fixtime not between", value1, value2, "fixtime");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsIsNull() {
            addCriterion("equipment_details is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsIsNotNull() {
            addCriterion("equipment_details is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsEqualTo(String value) {
            addCriterion("equipment_details =", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsNotEqualTo(String value) {
            addCriterion("equipment_details <>", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsGreaterThan(String value) {
            addCriterion("equipment_details >", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_details >=", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsLessThan(String value) {
            addCriterion("equipment_details <", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsLessThanOrEqualTo(String value) {
            addCriterion("equipment_details <=", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsLike(String value) {
            addCriterion("equipment_details like", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsNotLike(String value) {
            addCriterion("equipment_details not like", value, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsIn(List<String> values) {
            addCriterion("equipment_details in", values, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsNotIn(List<String> values) {
            addCriterion("equipment_details not in", values, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsBetween(String value1, String value2) {
            addCriterion("equipment_details between", value1, value2, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentDetailsNotBetween(String value1, String value2) {
            addCriterion("equipment_details not between", value1, value2, "equipmentDetails");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("employee is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("employee is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(Integer value) {
            addCriterion("employee =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(Integer value) {
            addCriterion("employee <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(Integer value) {
            addCriterion("employee >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(Integer value) {
            addCriterion("employee <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(Integer value) {
            addCriterion("employee <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<Integer> values) {
            addCriterion("employee in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<Integer> values) {
            addCriterion("employee not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(Integer value1, Integer value2) {
            addCriterion("employee between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(Integer value1, Integer value2) {
            addCriterion("employee not between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(Integer value) {
            addCriterion("storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(Integer value) {
            addCriterion("storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(Integer value) {
            addCriterion("storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(Integer value) {
            addCriterion("storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(Integer value) {
            addCriterion("storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<Integer> values) {
            addCriterion("storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<Integer> values) {
            addCriterion("storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(Integer value1, Integer value2) {
            addCriterion("storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeIsNull() {
            addCriterion("depreciationtype is null");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeIsNotNull() {
            addCriterion("depreciationtype is not null");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeEqualTo(Integer value) {
            addCriterion("depreciationtype =", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeNotEqualTo(Integer value) {
            addCriterion("depreciationtype <>", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeGreaterThan(Integer value) {
            addCriterion("depreciationtype >", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("depreciationtype >=", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeLessThan(Integer value) {
            addCriterion("depreciationtype <", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeLessThanOrEqualTo(Integer value) {
            addCriterion("depreciationtype <=", value, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeIn(List<Integer> values) {
            addCriterion("depreciationtype in", values, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeNotIn(List<Integer> values) {
            addCriterion("depreciationtype not in", values, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeBetween(Integer value1, Integer value2) {
            addCriterion("depreciationtype between", value1, value2, "depreciationtype");
            return (Criteria) this;
        }

        public Criteria andDepreciationtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("depreciationtype not between", value1, value2, "depreciationtype");
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