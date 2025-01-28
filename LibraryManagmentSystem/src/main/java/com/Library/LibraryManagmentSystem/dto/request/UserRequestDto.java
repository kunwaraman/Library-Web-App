package com.Library.LibraryManagmentSystem.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserRequestDto {

    @NotBlank(message ="email can't be blank") // ye annotation backend validation ke liye use hoti hai
    // taki user galat ya incomplete data na bheje
    //Ye ek validation annotation hai jo ensure karta hai ki email field empty (khaali) nahi ho sakti.
    private String email;
    @NotNull
    private String phoneNumber;

}
/*
Jab aapko front-end aur back-end ke beech data exchange karna hota hai, tab DTO kaafi useful hota hai. For example:

Front-end ko data bhejna (response): Aap sirf wahi fields bhejte ho jo zaroori hoti hain, taaki unnecessary data send na ho.

Back-end ko data lena (request): DTO sirf client se aaye data ko handle karta hai, taaki aapka core business logic isse alag rahe.

----------------**------------------------
Without DTO (Direct Entity):
Aap apni puri database entity ko front-end bhej dete ho, jo kaafi bada data ho sakta hai. Isse unnecessary bandwidth use hoti hai.

With DTO:
Aap sirf important fields (jaise id, name, email) ko DTO ke through bhejte ho. Yeh light-weight hota hai aur network call fast hoti hai.

"Bring as much data as possible" concept:
Agar aapko ek user ke saath uski books aur transactions ki bhi zarurat hai, toh aap eager loading ya ek aise query likhte ho jo user ke saath books aur transactions dono ek hi call me fetch kar le. Isse multiple network calls se bach jaata hai.



 */
