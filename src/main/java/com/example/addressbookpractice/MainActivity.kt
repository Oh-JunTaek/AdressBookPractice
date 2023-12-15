package com.example.addressbookpractice

fun main() {
    val addressBook = AddressBook()
    while (true) {
        println("1: 연락처 추가 | 2: 연락처 조회 | 3: 연락처 수정 | 4: 연락처 삭제 | 5: 종료")
        val input = readLine() ?: ""
        when (input) {
            "1" -> {
                println("추가할 연락처의 이름, 전화번호, 이메일을 입력하세요.")
                val (name, phoneNumber, email) = readLine()?.split(",") ?: listOf("", "", "")
                addressBook.add(Contact(name.trim(), phoneNumber.trim(), email.trim()))
                println("연락처가 추가되었습니다!")
            }
            "2" -> {
                println("조회할 연락처의 이름을 입력하세요.")
                val name = readLine() ?: ""
                val contact = addressBook.find(name)
                if (contact != null) {
                    println("이름: ${contact.name}, 전화번호: ${contact.phoneNumber}, 이메일: ${contact.email}")
                } else {
                    println("해당 이름의 연락처를 찾을 수 없습니다.")
                }
            }
            "3" -> {
                println("수정할 연락처의 이름을 입력하세요.")
                val name = readLine() ?: ""
                println("새로운 연락처의 이름, 전화번호, 이메일을 입력하세요.")
                val (newName, newPhoneNumber, newEmail) = readLine()?.split(",") ?: listOf("", "", "")
                if (addressBook.update(name, Contact(newName.trim(), newPhoneNumber.trim(), newEmail.trim()))) {
                    println("연락처가 수정되었습니다!")
                } else {
                    println("해당 이름의 연락처를 찾을 수 없습니다.")
                }
            }
            "4" -> {
                println("삭제할 연락처의 이름을 입력하세요.")
                val name = readLine() ?: ""
                if (addressBook.delete(name)) {
                    println("연락처가 삭제되었습니다!")
                } else {
                    println("해당 이름의 연락처를 찾을 수 없습니다.")
                }
            }
            "5" -> {
                println("프로그램을 종료합니다.")
                break
            }
            else -> {
                println("잘못된 입력입니다.")
            }
        }
    }
}