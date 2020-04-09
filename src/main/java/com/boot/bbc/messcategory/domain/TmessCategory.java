package com.boot.bbc.messcategory.domain;

import com.boot.bbc.util.parameterverify.VerifyError;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class TmessCategory {
    private int categoryId;
    @NotEmpty(message = VerifyError.CATEGORY_NOT_NULL)
    @Size(min = 4 ,max = 8, message = VerifyError.CATEGORY_NAME_SIZE)
    private String category;
    @NotEmpty(message = VerifyError.CATEGORY_OWNER_NOT_NULL)
    private String categoryOwner;

    public TmessCategory() {

    }

    public TmessCategory(String category, String categoryOwner) {
        this.category = category;
        this.categoryOwner = categoryOwner;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryOwner() {
        return categoryOwner;
    }

    public void setCategoryOwner(String categoryOwner) {
        this.categoryOwner = categoryOwner;
    }
}
