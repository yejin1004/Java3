public class MemberDTO {
package com.example.library.dto;

import lombok.Data;

    @data
    public class MemberDTO
        private String email;
        private String password;
        private String name;
        private String phone;
        private String address;
        private String memberType;

}
