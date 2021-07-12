package com.dafiti.setup.datadefinitions;

import com.dafiti.models.RegistrationData;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DefiniciondeModelos {

    @DataTableType
    public RegistrationData registrationDataEntry(Map<String, String> entry) {
        return new RegistrationData(
                entry.get("email"),
                entry.get("password"),
                entry.get("idType"),
                entry.get("id"),
                entry.get("name"),
                entry.get("lastName"),
                entry.get("bithDate"),
                entry.get("gender")
        );
    }

}
