package mytest.kopring2.repository

import mytest.kopring2.entity.TestMany
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestManyRepository: JpaRepository<TestMany, Long> {
    fun findAllBy(): List<TestMany>
}