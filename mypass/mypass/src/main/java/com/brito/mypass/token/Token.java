package com.brito.mypass.token;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Token {

    private String token;

    private String type;

    private String username;
}
