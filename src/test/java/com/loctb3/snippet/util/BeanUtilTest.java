package com.loctb3.snippet.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
public class BeanUtilTest {
    @Test
    public void copyProperties_Case1() {
        LocalDate lDateSrc = LocalDate.of(2020, 1, 1);
        In in = new In("in");
        People src = new People("LocTB", lDateSrc, in);

        People dest = BeanUtil.copyProperties(src, People.class);

        System.out.println(dest.getIn().getTest());
        in.setTest("out");
        System.out.println(dest.getIn().getTest());

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class People {
    private String name;
    private LocalDate dob;
    private In in;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class In{
    private String test;
}