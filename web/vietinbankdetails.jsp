<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="./layout/header.jsp" />

<div class="container">
    <div class="row justify-content-center mt-3">
        <div class="col-md-6" style="max-width: 500px">
            <img src="./Images/vietinbank.jpg" class="img-fluid" alt="Sample Image">
        </div>
        <div class="col-md-6">
            <a href="#" class="btn btn-link">
                <span class="bi bi-arrow-left"></span> Quay lại
            </a>
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title text-center">Bạn hãy chuyển khoản vào số tài khoản sau:</h3>
                    <h5 class="card-title text-center">Thông tin chuyển khoản</h5>
                    <p class="card-text">Chuyển khoản theo cú pháp: <strong>Mã Dự án + MOOC + USERNAME</strong>.</p>
                    <p class="card-text">Sau khi chuyển khoản, hãy bấm xác nhận để hệ thống check và xác nhận lại. Nếu nhập sai cú pháp sẽ khó tra soát lại khi sao kê.</p>
                    <a href="#" class="btn btn-primary d-block mx-auto" style="max-width: 280px">Xác nhận chuyển khoản</a>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="./layout/footer.jsp" />
