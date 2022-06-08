//package com.example.demoliquidbase.sevice;
//
//import com.example.demoliquidbase.entity.Sublimit;
//import com.example.demoliquidbase.entity.SublimitDictionary;
//import lombok.RequiredArgsConstructor;
//import lombok.val;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//
//@SpringBootTest
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
//@DisplayName("Процессы саблимита в заявке при на оформление кредита")
//class SublimitServiceImplTest {
//
//    @Mock
//    private SublimitService service;
//
//
//    @Test
//    @DisplayName("Сохранение саблимита в заявке при на оформление кредита")
//    void saveSublimitToWhenApplyingForLoanTest() {
//
//        val sublimitDictionary = SublimitDictionary.builder()
//                .id(21)
//                .description("Present")
//                .isDeleted(true)
//                .updated(1L)
//                .build();
//
//        val sublimit = Sublimit.builder()
//                .sublimitDictionary(sublimitDictionary)
//                .sublimitSum(BigDecimal.valueOf(2_200_000.000000001))
//                .currency(null)
//                .sublimitSumToRub(BigDecimal.valueOf(2_200_000.000000001))
//                .sublimitPeriod(13)
//                .build();
//
//        Assertions.assertThat(sublimit).isNotNull()
//                .isEqualTo(service.addSublimit(sublimit))
//                .matches(sublimit1 -> sublimit1.getSublimitDictionary().equals(sublimit.getSublimitDictionary()))
//                .matches(sublimit1 -> sublimit1.getSublimitSum().equals(sublimit.getSublimitSum()))
//                .matches(sublimit1 -> sublimit1.getCurrency().equals(sublimit.getCurrency()))
//                .matches(sublimit1 -> sublimit1.getSublimitSumToRub().equals(sublimit.getSublimitSumToRub()))
//                .matches(sublimit1 -> sublimit1.getSublimitPeriod().equals(sublimit.getSublimitPeriod()));
//    }
//
//    @Test
//    @DisplayName("Обновление саблимита в заявке при на оформление кредита")
//    void updateSublimitToWhenApplyingFromLoanTest() {
//        // given
//        // when
//        // then
//    }
//
//    @Test
//    @DisplayName("Удаление саблимита в заявке при на оформление кредита")
//    void deleteSublimitToWhenApplyingFromLoanTest() {
//        // given
//        // when
//        // then
//    }
//}
