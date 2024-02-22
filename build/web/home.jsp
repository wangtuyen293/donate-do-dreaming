<%-- 
    Document   : home
    Created on : Jan 13, 2024, 3:57:22 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Donate Do Dreaming</title>
        <meta name="description" content>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="manifest" href="site.webmanifest">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/flaticon.css">
        <link rel="stylesheet" href="assets/css/slicknav.css">
        <link rel="stylesheet" href="assets/css/animate.min.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="./style.css"> 
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/material-design-iconic-font/2.2.0/css/material-design-iconic-font.min.css">
        <style>
            /* Đặt độ rộng cho form và căn giữa trang */
            .custom-form {
                max-width: 50%;
                margin: auto;
                margin-top: 50px; /* Điều chỉnh khoảng cách từ trên xuống theo ý muốn */
            }
        </style>
        <script nonce="d2fa0ba4-a7ad-4e33-aa0b-7c90e6c942d6">
            (function (w, d) {
                !function (dp, dq, dr, ds) {
                    dp[dr] = dp[dr] || {};
                    dp[dr].executed = [];
                    dp.zaraz = {
                        deferred: [],
                        listeners: []
                    };
                    dp.zaraz.q = [];
                    dp.zaraz._f = function (dt) {
                        return async function () {
                            var du = Array.prototype.slice.call(arguments);
                            dp.zaraz.q.push({
                                m: dt,
                                a: du
                            })
                        }
                    };
                    for (const dv of ["track", "set", "debug"])
                        dp.zaraz[dv] = dp.zaraz._f(dv);
                    dp.zaraz.init = () => {
                        var dw = dq.getElementsByTagName(ds)[0],
                                dx = dq.createElement(ds),
                                dy = dq.getElementsByTagName("title")[0];
                        dy && (dp[dr].t = dq.getElementsByTagName("title")[0].text);
                        dp[dr].x = Math.random();
                        dp[dr].w = dp.screen.width;
                        dp[dr].h = dp.screen.height;
                        dp[dr].j = dp.innerHeight;
                        dp[dr].e = dp.innerWidth;
                        dp[dr].l = dp.location.href;
                        dp[dr].r = dq.referrer;
                        dp[dr].k = dp.screen.colorDepth;
                        dp[dr].n = dq.characterSet;
                        dp[dr].o = (new Date).getTimezoneOffset();
                        if (dp.dataLayer)
                            for (const dC of Object.entries(Object.entries(dataLayer).reduce(((dD, dE) => ({
                            ...dD[1],
                                    ...dE[1]
                            })), {})))
                                zaraz.set(dC[0], dC[1], {
                                    scope: "page"
                                });
                        dp[dr].q = [];
                        for (; dp.zaraz.q.length; ) {
                            const dF = dp.zaraz.q.shift();
                            dp[dr].q.push(dF)
                        }
                        dx.defer = !0;
                        for (const dG of [localStorage, sessionStorage])
                            Object.keys(dG || {}).filter((dI => dI.startsWith("_zaraz_"))).forEach((dH => {
                                try {
                                dp[dr]["z_" + dH.slice(7)] = JSON.parse(dG.getItem(dH))
                                } catch {
                                dp[dr]["z_" + dH.slice(7)] = dG.getItem(dH)
                                }
                            }));
                        dx.referrerPolicy = "origin";
                        dx.src = "/cdn-cgi/zaraz/s.js?z=" + btoa(encodeURIComponent(JSON.stringify(dp[dr])));
                        dw.parentNode.insertBefore(dx, dw)
                    };
                    ["complete", "interactive"].includes(dq.readyState) ? zaraz.init() : dp.addEventListener("DOMContentLoaded", zaraz.init)
                }(w, d, "zarazData", "script");
            })(window, document);
        </script>
        <style>
            /* Add your custom styles here */

            /* Adjust the alignment of the logo in the header */
            .header-area .logo {
                text-align: center;
            }

            /* Style the search form in the header */
            .header-right form {
                display: flex;
                align-items: center;
            }

            /* Style the login dropdown menu */
            .header-right .dropdown-menu {
                left: auto;
                right: 0;
            }

            /* Make the dropdown content appear from right to left */
            .header-right .dropdown-menu {
                transform: translateX(-90%);
            }

            /* Add margin to the login button */
            .header-right .nav-link {
                margin-left: 10px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="./layout/header.jsp" />
        <main>
            <div class="slider-area ">
                <div class="slider-active">
                    <div class="single-slider slider-height d-flex align-items-center slide-bg">
                        <div class="container">
                            <div class="row justify-content-between align-items-center">
                                <div class="col-xl-8 col-lg-8 col-md-8 col-sm-8">
                                    <div class="hero__caption">
                                        <h1 data-animation="fadeInLeft" data-delay=".4s" data-duration="2000ms">Quyên góp cho những dự án cộng đồng</h1>
                                        <p data-animation="fadeInLeft" data-delay=".7s" data-duration="2000ms">Vì một cộng đồng chung tay cùng phát triển, vì những người có hoàn cảnh khó khăn có được cuộc sống tốt đẹp hơn.</p>

                                        <div class="hero__btn" data-animation="fadeInLeft" data-delay=".8s"
                                             data-duration="2000ms">
                                            <a href="industries.html" class="btn hero-btn">Donate now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-lg-3 col-md-4 col-sm-4 d-none d-sm-block">
                                    <div class="hero__img" data-animation="bounceIn" data-delay=".4s">
                                        <img src="assets/img/hero/dona.png" alt class=" heartbeat">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="single-slider slider-height d-flex align-items-center slide-bg">
                        <div class="container">
                            <div class="row justify-content-between align-items-center">
                                <div class="col-xl-8 col-lg-8 col-md-8 col-sm-8">
                                    <div class="hero__caption">
                                        <h1 data-animation="fadeInLeft" data-delay=".4s" data-duration="2000ms">Tham gia quyên góp cho các chiến dịch từ thiện</h1>
                                        <p data-animation="fadeInLeft" data-delay=".7s" data-duration="2000ms">Khi bạn cho đi, bạn không mất đi. Thay vào đó, bạn nhận lại nhiều hơn. 
                                            Bởi vì lòng trắc ẩn biết rằng bạn đã làm nên điều tốt đẹp cho người khác. 
                                        </p>

                                        <div class="hero__btn" data-animation="fadeInLeft" data-delay=".8s"
                                             data-duration="2000ms">
                                            <a href="industries.html" class="btn hero-btn">Donate Now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-3 col-lg-3 col-md-4 col-sm-4 d-none d-sm-block">
                                    <div class="hero__img" data-animation="bounceIn" data-delay=".4s">
                                        <img src="assets/img/hero/tre.jpeg" alt class=" heartbeat">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <section class="new-product-area section-padding30">
                <div class="container">

                    <div class="row">
                        <div class="col-xl-12">
                            <div class="section-tittle mb-70">
                                <h2>Những dự án nổi bật</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-new-pro mb-30 text-center">
                                <div class="product-img">
                                    <img src="assets/img/gallery/new_product1.png" alt>
                                </div>
                                <div class="product-caption">
                                    <h3><a href="product_details.html">Project 1</a></h3>
                                    <div id="progress-container">
                                        <progress id="my-progress" value="75" max="100"></progress>
                                    </div>
                                    <h4> Tiến trình dự án: </h4>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-new-pro mb-30 text-center">
                                <div class="product-img">
                                    <img src="assets/img/gallery/new_product2.png" alt>
                                </div>
                                <div class="product-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <div id="progress-container">
                                        <progress id="my-progress" value="75" max="100"></progress>
                                    </div>
                                    <h4> Tiến trình dự án: </h4>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-new-pro mb-30 text-center">
                                <div class="product-img">
                                    <img src="assets/img/gallery/new_product3.png" alt>
                                </div>
                                <div class="product-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <div id="progress-container">
                                        <progress id="my-progress" value="75" max="100"></progress>
                                    </div>
                                    <h4> Tiến trình dự án: </h4>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <div class="gallery-area">
                <div class="container-fluid p-0 fix">
                    <div class="row">
                        <div class="col-xl-6 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-gallery mb-30">
                                <div class="gallery-img big-img"
                                     style="background-image: url(assets/img/gallery/gallery1.png);"></div>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-gallery mb-30">
                                <div class="gallery-img big-img"
                                     style="background-image: url(assets/img/gallery/gallery2.png);"></div>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-4 col-md-12">
                            <div class="row">
                                <div class="col-xl-12 col-lg-12 col-md-6 col-sm-6">
                                    <div class="single-gallery mb-30">
                                        <div class="gallery-img small-img"
                                             style="background-image: url(assets/img/gallery/gallery3.png);"></div>
                                    </div>
                                </div>
                                <div class="col-xl-12 col-lg-12  col-md-6 col-sm-6">
                                    <div class="single-gallery mb-30">
                                        <div class="gallery-img small-img"
                                             style="background-image: url(assets/img/gallery/gallery4.png);"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="popular-items section-padding30">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-xl-7 col-lg-8 col-md-10">
                            <div class="section-tittle mb-70 text-center">
                                <h2>Những dự án tiềm năng</h2>
                                <p>Tiềm năng khám phá con người là vô hạn, và quỹ cộng đồng như một bước đệm giúp những ước mơ bay xa.</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular1.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular2.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular3.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular4.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular5.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6">
                            <div class="single-popular-items mb-50 text-center">
                                <div class="popular-img">
                                    <img src="assets/img/gallery/popular6.png" alt>
                                    <div class="img-cap">
                                        <span>Donate</span>
                                    </div>
                                    <div class="favorit-items">
                                        <span class="flaticon-heart"></span>
                                    </div>
                                </div>
                                <div class="popular-caption">
                                    <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                                    <span>$ 45,743</span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row justify-content-center">
                        <div class="room-btn pt-70">
                            <a href="catagori.html" class="btn view-btn1">Xem thêm dự án</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="watch-area section-padding30">
                <div class="container">
                    <div class="row align-items-center justify-content-between padding-130">
                        <div class="col-lg-5 col-md-6">
                            <div class="watch-details mb-40">
                                <h2>Từ thiện cộng đồng</h2>
                                <p>Trong mỗi hành động thiện nguyện, chúng ta đang chứng tỏ sự nhân ái và lòng tử tế của con người. 
                                    Những lời chia sẻ, nụ cười, và sự quan tâm chân thành không chỉ làm thay đổi cuộc sống của những người khác, mà còn lan tỏa năng lượng tích cực và hy vọng trong xã hội. 
                                    Khi ta góp phần vào công việc thiện nguyện, ta không chỉ đem lại những lợi ích vật chất mà còn làm thay đổi sâu sắc trong tâm hồn của chính mình. 
                                    Từ những trải nghiệm này, ta học cách trân trọng những điều nhỏ bé trong cuộc sống, nhận ra sự quan trọng của sự nhân ái và lòng biết ơn.</p>
                                <a href="shop.html" class="btn">Xem thêm các chiến dịch</a>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-10">
                            <div class="choice-watch-img mb-40">
                                <img src="Images/lam-tu-thien.jpg" alt>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page="./layout/footer.jsp" />
        
        
    </body>
</html>