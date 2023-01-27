package mytest.kopring2.service

import mytest.kopring2.dto.ReadTestDto
import mytest.kopring2.entity.Test
import mytest.kopring2.repository.TestManyRepository
import mytest.kopring2.repository.TestRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import org.json.JSONArray
import org.json.JSONObject
import java.util.Objects

@Service
class TestService(
        private val testRepository: TestRepository,
        private val testManyRepository: TestManyRepository
) {
    // findAll()의 변환 메소드
    // org.springframework.data.domain.Pageable : 페이징을 제공하는 인터페이스
    // org.springframework.data.domain.Page     : 페이징의 findAll()의 기본적인 반환 메서드로 여러 반환 타입 중 하나

    // 기본적으로 DTO는 JSON형식인 것 같음.

    // 데이터 하나 일 때 => DTO자체를 반환
    fun getTest(): Test {
        return testRepository.findOneBy()
    }


    // 데이터 여러 개 일 때 => 배열이 JSON데이터를 담고 있는 형식
    // findALLBy는 기본적으로 배열의 형태다. (데이터 여러 개를 담아야하니까)
    // 그래서 해당 배열 안에 DTO를 넣으면 배열 안에 JSON데이터가 알아서 들어간다.
    fun getTestMany(): List<ReadTestDto> {
        val test = testManyRepository.findAllBy()
        return test.map { it.toReadTestDTO() }
    }
}
