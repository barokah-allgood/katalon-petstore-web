# Katalon Studio Web Automation - JPetStore Demo

Automation testing project menggunakan Katalon Studio (Hybrid Mode: Manual + Script) untuk menguji website JPetStore Demo (Octoperf). Proyek ini dikembangkan untuk memenuhi Final Project Web Automation dengan menerapkan dynamic data, positive/negative testing, Test Suite, Global Variables, dan execution reporting.

---

## Fitur & Cakupan Pengujian (Test Coverage)
Proyek ini mencakup 5 Test Case utama yang memvalidasi fungsionalitas utama aplikasi web:

| No | Test Case ID | Jenis Pengujian | Deskripsi Skenario | Status |
|----|-----------------------|-----------------|-------------------------------------------------------------------------|--------|
| 1 | `TC01_Successful_Login` | Positive | Menguji login pengguna menggunakan kredensial valid dari Global Variable. | **Passed** |
| 2 | `TC02_Failed_Login` | Negative | Menguji penolakan sistem saat login menggunakan kredensial salah (validasi error message). | **Passed** |
| 3 | `TC03_Search_Product` | Positive | Menguji fitur pencarian katalog produk menggunakan kata kunci ("Dog"). | **Passed** |
| 4 | `TC04_Search_And_Verify`| Positive | Menguji pencarian produk alternatif dan validasi detail item ("Fish"). | **Passed** |
| 5 | `TC05_Search_Cats` | Positive | Menguji pencarian produk kategori kucing ("Cat"). | **Passed** |

---

## Tech Stack & Pendekatan
* **Automation Tool:** Katalon Studio (v11.5.0+)
* **Language:** Groovy / Java
* **Mode:** Hybrid (Manual Object Repository + Groovy Scripting)
* **Configuration:** Global Variables (untuk URL dan kredensial uji tanpa hardcode)
* **Browser:** Google Chrome / Microsoft Edge (Chromium Driver)

---

## Cara Menjalankan Project

1. Clone Repository: Buka terminal atau command prompt di komputer Anda, lalu jalankan perintah `git clone https://github.com/barokah-allgood/katalon-petstore-web.git` untuk mengunduh proyek ini.
2. Buka Project di Katalon Studio: Buka aplikasi Katalon Studio, pilih menu File > Open Project, lalu arahkan ke folder `katalon-petstore-web` hasil clone tersebut.
3. Konfigurasi Global Variables: Di panel Tests Explorer sebelah kiri, buka menu Profiles > default, dan pastikan variabel `url`, `validUsername`, serta `validPassword` sudah terisi dengan benar.
4. Menjalankan Test Suite: Di panel Tests Explorer, buka folder Test Suites, pilih Test Suite `TS_JPetStore_Regression`, lalu klik tombol Run (ikon Play hijau) di toolbar atas dan pilih browser Chrome.

---

## Test Execution & Reporting
Seluruh test case dieksekusi secara berurutan di dalam Test Suite `TS_JPetStore_Regression`. Laporan hasil eksekusi (Execution Report) tersimpan otomatis di dalam direktori `Reports/` Katalon Studio dengan status kelulusan 100% Passed.

---
Author: Rizki Barokah
