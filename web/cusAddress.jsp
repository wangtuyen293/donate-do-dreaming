<%-- 
    Document   : cusAddress
    Created on : Feb 12, 2024, 3:21:33 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="./layout/header.jsp" />
<div class="container mt-5">
    <form action="processoder" method="post"> <!-- Add your desired action URL -->
        <div class="row">
            <div class="col-md-6">
                <div class="card" style="background-color: #F0F8FF;">
                    <div class="card-body">
                        <h3 class="card-title text-center">Thông tin Thanh toán và Giao hàng</h3>
                            <div class="form-group">
                                <label for="fullName">Họ và tên *</label>
                                <input type="text" class="form-control" id="fullName" placeholder="Nhập họ và tên" required>
                            </div>

                            <div class="form-group">
                                <label for="phoneNumber">Số điện thoại *</label>
                                <input type="tel" class="form-control" id="phoneNumber" placeholder="Nhập số điện thoại" required>
                            </div>

                            <div class="form-group">
                                <label for="email">Địa chỉ email *</label>
                                <input type="email" class="form-control" id="email" placeholder="Nhập địa chỉ email" required>
                            </div>
                            <div class="form-group">
                                <label for="province">Tỉnh/Thành phố *</label>
                                <select class="form-control" id="province" onchange="loadDistricts()" required>
                                    <option value="">Chọn Tỉnh/Thành phố</option>
                                    <option value="An Giang">An Giang</option>
                                    <option value="Bà Rịa - Vũng Tàu">Bà Rịa - Vũng Tàu</option>
                                    <option value="Bạc Liêu">Bạc Liêu</option>
                                    <option value="Bắc Kạn">Bắc Kạn</option>
                                    <option value="Bắc Giang">Bắc Giang</option>
                                    <option value="Bắc Ninh">Bắc Ninh</option>
                                    <option value="Bến Tre">Bến Tre</option>
                                    <option value="Cà Mau">Cà Mau</option>
                                    <option value="Cao Bằng">Cao Bằng</option>
                                    <option value="Đà Nẵng">Đà Nẵng</option>
                                    <option value="Đắk Lắk">Đắk Lắk</option>
                                    <option value="Đắk Nông">Đắk Nông</option>
                                    <option value="Điện Biên">Điện Biên</option>
                                    <option value="Đồng Tháp">Đồng Tháp</option>
                                    <option value="Đồng Nai">Đồng Nai</option>
                                    <option value="Gia Lai">Gia Lai</option>
                                    <option value="Hà Giang">Hà Giang</option>
                                    <option value="Hà Nam">Hà Nam</option>
                                    <option value="Hà Nội">Hà Nội</option>
                                    <option value="Hà Tĩnh">Hà Tĩnh</option>
                                    <option value="Hải Dương">Hải Dương</option>
                                    <option value="Hải Phòng">Hải Phòng</option>
                                    <option value="Hậu Giang">Hậu Giang</option>
                                    <option value="Hòa Bình">Hòa Bình</option>
                                    <option value="Hồ Chí Minh">Hồ Chí Minh</option>
                                    <option value="Hưng Yên">Hưng Yên</option>
                                    <option value="Khánh Hòa">Khánh Hòa</option>
                                    <option value="Kiên Giang">Kiên Giang</option>
                                    <option value="Kon Tum">Kon Tum</option>
                                    <option value="Lai Châu">Lai Châu</option>
                                    <option value="Lâm Đồng">Lâm Đồng</option>
                                    <option value="Lạng Sơn">Lạng Sơn</option>
                                    <option value="Lào Cai">Lào Cai</option>
                                    <option value="Long An">Long An</option>
                                    <option value="Nam Định">Nam Định</option>
                                    <option value="Nghệ An">Nghệ An</option>
                                    <option value="Ninh Bình">Ninh Bình</option>
                                    <option value="Ninh Thuận">Ninh Thuận</option>
                                    <option value="Phú Thọ">Phú Thọ</option>
                                    <option value="Phú Yên">Phú Yên</option>
                                    <option value="Quảng Bình">Quảng Bình</option>
                                    <option value="Quảng Nam">Quảng Nam</option>
                                    <option value="Quảng Ngãi">Quảng Ngãi</option>
                                    <option value="Quảng Ninh">Quảng Ninh</option>
                                    <option value="Quảng Trị">Quảng Trị</option>
                                    <option value="Sóc Trăng">Sóc Trăng</option>
                                    <option value="Sơn La">Sơn La</option>
                                    <option value="Tây Ninh">Tây Ninh</option>
                                    <option value="Thái Bình">Thái Bình</option>
                                    <option value="Thái Nguyên">Thái Nguyên</option>
                                    <option value="Thanh Hóa">Thanh Hóa</option>
                                    <option value="Thừa Thiên Huế">Thừa Thiên Huế</option>
                                    <option value="Tiền Giang">Tiền Giang</option>
                                    <option value="Trà Vinh">Trà Vinh</option>
                                    <option value="Tuyên Quang">Tuyên Quang</option>
                                    <option value="Vĩnh Long">Vĩnh Long</option>
                                    <option value="Vĩnh Phúc">Vĩnh Phúc</option>
                                    <option value="Yên Bái">Yên Bái</option>

                                </select>
                            </div>

                            <div class="form-group">
                                <label for="district">Địa chỉ cụ thể</label>
                                <input type="text" class="form-control" id="addressDetail" placeholder="Nhập địa chỉ cụ thể" required>

                            </div>
                    </div>
                </div>
            </div>

            <div class="col-md-6">
                <div class="card" style="background-color: #F0F8FF;">
                    <div class="card-body">
                        <h3 class="card-title text-center">Chọn Phương Thức Thanh Toán</h3>
                        <div class="card mb-3">
                            <div class="card-body" data-toggle="collapse" href="#collapseVietinbank">
                                <label>
                                    <input type="radio" name="payment_method" value="vietinbank"> Chuyển khoản Vietinbank
                                </label>
                            </div>
                            <div id="collapseVietinbank" class="collapse">
                                <!-- Additional information for Vietinbank -->
                                <div class="card-body">
                                    <p>Chuyển khoản vào tài khoản Vietinbank của chúng tôi. Đơn hàng sẽ được xác nhận ngay sau khi chuyển khoản

                                        Tra soát giao dịch tự động bởi Casso Robot</p>
                                </div>
                            </div>
                        </div>

                        <div class="card mb-3">
                            <div class="card-body" data-toggle="collapse" href="#collapseMomo">
                                <label>
                                    <input type="radio" name="payment_method" value="momo"> Thanh toán bằng MOMO
                                </label>
                            </div>
                            <div id="collapseMomo" class="collapse">
                                <!-- Additional information for Momo -->
                                <div class="card-body">
                                    <p>Thanh toán thông qua Ví điện tử MoMo. Sau khi bấm nút thanh toán, 
                                        bạn sẽ được chuyển sang website MoMo để quét mã QR thanh toán hoặc đăng nhập vào tài khoản MoMo của bạn. 
                                        Bạn cần có tiền trong ví điện tử MoMo để sử dụng chức năng này.</p>
                                </div>
                            </div>
                        </div>

                        <div class="card mb-3">
                            <div class="card-body" data-toggle="collapse" href="#collapseATM">
                                <label>
                                    <input type="radio" name="payment_method" value="momo"> Thanh toán bằng thẻ ATM
                                </label>
                            </div>
                            <div id="collapseATM" class="collapse">
                                <!-- Additional information for Momo -->
                                <div class="card-body">
                                    <p>
                                        Thanh toán đơn hàng bằng thẻ ATM
                                        Chức năng quẹt thẻ được hỗ trợ bởi cổng thanh toán trực tuyến Bảo Kim.
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="card mb-3">
                            <div class="card-body" data-toggle="collapse" href="#collapseVietQR">
                                <label>
                                    <input type="radio" name="payment_method" value="momo"> Thanh toán bằng VietQR(PayOS)
                                </label>
                            </div>
                            <div id="collapseVietQR" class="collapse">
                                <!-- Additional information for Momo -->
                                <div class="card-body">
                                    <p>
                                        Thanh toán đơn hàng qua payOS Tiện lợi và miễn phí. Hầu hết App ngân hàng Việt Nam đã hỗ trợ mã VietQR trên payOS
                                    </p>
                                </div>
                            </div>
                        </div>



                    </div>
                </div>
            </div>
        </div>

        <div class="row mt-3 justify-content-center">
            <button type="submit" style="max-width: 150px" class="btn btn-primary">Đặt hàng</button>
        </div>
    </form>
</div>
<jsp:include page="./layout/footer.jsp" />
