package com.example.addressbookpractice

class AddressBook {
    private val contacts = mutableListOf<Contact>()

    fun add(contact: Contact) {
        // 연락처 추가
    }

    fun find(name: String): Contact? {
        // 연락처 검색
    }

    fun update(name: String, newContact: Contact): Boolean {
        // 연락처 정보 수정
    }

    fun delete(name: String): Boolean {
        // 연락처 삭제
    }

    fun load() {
        // 파일에서 JSON 형식으로 저장된 연락처 데이터를 불러오는 코드
    }

    fun save() {
        // 파일에 연락처 데이터를 JSON 형식으로 저장하는 코드
    }

}