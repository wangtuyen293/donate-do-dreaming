/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


const startDateInput = document.getElementById('post-start-date');
const endDateInput = document.getElementById('post-end-date');

// Hàm kiểm tra tính hợp lệ của ngày
function isValidDate(date) {
    return date instanceof Date && !isNaN(date);
}

// Hàm tính toán số tháng giữa hai ngày
function getMonthsBetweenDates(startDate, endDate) {
    const months = (endDate.getFullYear() - startDate.getFullYear()) * 12 + endDate.getMonth() - startDate.getMonth();
    return months;
}

// Hàm cập nhật lỗi cho input
function updateError(input, message) {
    const errorElement = input.parentNode.querySelector('.error');
    if (errorElement) {
        errorElement.textContent = message;
    } else {
        const errorSpan = document.createElement('span');
        errorSpan.classList.add('error');
        errorSpan.textContent = message;
        input.parentNode.appendChild(errorSpan);
    }
}

// Hàm kiểm tra và cập nhật trạng thái form
function validateForm() {
    const startDate = new Date(startDateInput.value);
    const endDate = new Date(endDateInput.value);
    let isValid = true;

    // Kiểm tra startDate hợp lệ
    if (!isValidDate(startDate)) {
        updateError(startDateInput, 'Start date is not valid');
        isValid = false;
    } else {
        updateError(startDateInput, '');
    }

    // Kiểm tra endDate hợp lệ
    if (!isValidDate(endDate)) {
        updateError(endDateInput, 'End date is not valid');
        isValid = false;
    } else {
        updateError(endDateInput, '');
    }

    // Kiểm tra endDate sau startDate ít nhất 3 tháng
    if (isValid && getMonthsBetweenDates(startDate, endDate) < 3) {
        updateError(endDateInput, 'End date must be at least 3 months after start date');
        isValid = false;
    } else {
        updateError(endDateInput, '');
    }

    return isValid;
}

// Thêm sự kiện onchange cho input
startDateInput.addEventListener('change', validateForm);
endDateInput.addEventListener('change', validateForm);

// Gọi hàm validateForm khi submit form
const form = document.getElementById('create-project');
form.addEventListener('submit', (e) => {
    e.preventDefault();
    if (!validateForm()) {
        return;
    }
    // Submit form
});
